class Person:
    home_planet = "Earth"

    def __init__(self, full_name, phone_number):
        self._full_name = full_name
        self.phone_number = phone_number

    def get_phone_number(self):
        return self.phone_number

    def set_phone_number(self, phone_number):
        self.phone_number = phone_number

    @property
    def full_name(self):
        return self._full_name

    @full_name.setter
    def full_name(self, value):
        self._full_name = value

    def __str__(self):
        return f"{self._full_name} - {self.phone_number}"

    @classmethod
    def print_home_planet(cls):
        print("Home planet of every Person: ",cls.home_planet)