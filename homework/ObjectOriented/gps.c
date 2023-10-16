#include "gps.h"
#include <string.h>
#include <stdlib.h>
#include <math.h>

/* Prototypes */
bool parse_RMC(struct gps *);


/* ------------- Functions defined in the header file ---------------*/

struct gps * gps_parse_nmea0183_sentence(char * line)
{
    if(line == NULL || line[0] != '$')
    {
        return NULL;
    }

    char * token = strtok(line, ",");
    if( token == NULL)
    {
        return NULL;
    }
    struct gps * obj = (struct gps *)calloc(sizeof(struct gps),1);
    bool parse_ok = false;
    if(strcmp(token,"$GPRMC") == 0)
    {
        obj->message_type = GPRMC;
        parse_ok = parse_RMC(obj);
    }
    //else if(strcmp(token,"$GPGSA"))
    //{
    //    obj->message_type = GPGSA;
    //    parse_GSA(token, obj)
    //}
    //...
    if(parse_ok)
    {
        return obj;
    }
    else
    {
        free(obj);
        return NULL;
    }
}

void gps_destroy(struct gps * obj)
{
    free(obj);
}

void gps_print(struct gps * obj, FILE * stream)
{
    fprintf(stream, "%12s%8s%15f%15f%6.2f%8.2f\n", obj->gps_time, obj->gps_date, obj->latitude, obj->longitude, obj->sog, obj->cmg);
}

void gps_format(struct gps * obj, char * buf)
{
    sprintf(buf, "%12s%8s%15f%15f%6.2f%8.2f", obj->gps_time, obj->gps_date, obj->latitude, obj->longitude, obj->sog, obj->cmg);
}

/* ------------- Local helper functions --------------*/

/* Not thread safe as it depends on strtok already started tokenizing a string
    $GPRMC,210658.000,A,4451.0975,N,12314.1870,W,0.24,306.60,161106,,*19
*/
bool parse_RMC(struct gps * obj)
{
    bool parse_ok = true;
    int i = 1;
    char * token = strtok(NULL, ",");
    float val,deg;
    while (token != NULL) 
    {
        switch(i)
        {
            case 1:     // time
                strncpy(obj->gps_time, token, GPS_TIME_MAX_CHARS);
                break;
            case 2:     // fix
                if (strcmp(token, "A") == 0)
                {
                    obj->valid_satellite_fix = true;
                }
                else
                {
                    obj->valid_satellite_fix = false;
                }
                break;
            case 3:     // latitude
                val = (float)atof(token);     // outputs 0 if parse fails
                deg = floorf(val/100.0f);
                obj->latitude = deg + (val-100.0f*deg)/60.0f;     
                break;
            case 4:     // N or S
                if (strcmp(token, "S") == 0) 
                {
                    obj->latitude = -obj->latitude;
                }
                break;
            case 5:     // longitude
                val = (float)atof(token);     // outputs 0 if parse fails
                deg = floorf(val/100.0f);
                obj->longitude = deg + (val-100.0f*deg)/60.0f;
                break;
            case 6:     // W or E
                if (strcmp(token, "W") == 0) 
                {
                    obj->longitude = -obj->longitude;
                }
                break;
            case 7:     // SOG
                obj->sog = (float)atof(token);
                break;
            case 8:     // COG
                obj->cmg = (float)atof(token);
                break;
            case 9:     // date
                strncpy(obj->gps_date, token, GPS_DATE_MAX_CHARS);
                break;
            case 10:    // declination (not present)
                // not implemented yet
                break;
            case 11:    // checksum
                // not implemented yet
                break; 
        }
        token = strtok(NULL, ",");
        i++;
    }
    return parse_ok;    // have not yet implemented detection of parse errors so this will always be true
}