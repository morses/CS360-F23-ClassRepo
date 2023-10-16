#ifndef GPS_H
#define GPS_H

#include <stdbool.h>    // C99 has it so let's use it
#include <stdio.h>

enum gps_message_type
{
    GPRMC,      // only this one is implemented
    GPGSA,
    GPGGA,
    GPGSV
};

#define GPS_TIME_MAX_CHARS 10
#define GPS_DATE_MAX_CHARS 6

// example: $GPRMC,210659.000,A,4451.0974,N,12314.1873,W,0.81,264.86,161106,,*18
// see: http://aprs.gids.nl/nmea/#rmc
// TODO: convert date and time into standard ISO C and POSIX timestamp type, i.e. time_t
struct gps
{
    enum  gps_message_type message_type ;         // data for only this type is included in this particular instance
    char  gps_time[GPS_TIME_MAX_CHARS + 1]; // 210659.000 == 21:06:59.000 UTC in HH:MM:SS.sss format
    char  gps_date[GPS_DATE_MAX_CHARS + 1]; // 161106 == November 16, 2006
    bool  valid_satellite_fix;
    float latitude;             // 4451.0974, N == +4451.0974 deg,  S latitudes are negative
    float longitude;            // 12314.1873, W == -12314.1873 deg, W longitudes are negative
    float sog;                  // Speed over ground, in knots
    float cmg;                  // Course made good, in degrees (i.e. heading)
    bool  valid_checksum;       // NOT YET IMPLEMENTED
};

/* Parse a NMEA 0183 sentence and construct a gps object containing its data.
    For example: gps_parse_nmea0183_sentence("$GPRMC,210659.000,A,4451.0974,N,12314.1873,W,0.81,264.86,161106,,*18")
    where the string includes the trailing newline.
    NOTES: 
        - for every gps object created you must call gps_destroy(), which frees its heap allocated memory
        - currently only GPRMC is implemented
        - the string passed in will be modified (specifically commas will be replaced by 0x00)*/
struct gps * gps_parse_nmea0183_sentence(char * line);

/* Free all resources associated with this object. */
void gps_destroy(struct gps * obj);

/* Print the data in this object to the given I/O stream (for diagnostic purposes)*/
void gps_print(struct gps * obj, FILE * stream);

/* Print the data in this object to the given string.  Make sure buf is large enough to hold the string.*/
void gps_format(struct gps * obj, char * buf);

#endif