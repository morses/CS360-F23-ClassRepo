
struct Person {
    char * name;
    char * phoneNumber;
};

struct Person * create(char * name, char * phoneNumber)
{
    struct Person * person = malloc(sizeof(struct Person));
    assert(person != NULL);

    person->name = strdup(name);
    assert(person->name != NULL);

    person->phoneNumber = strdup(phoneNumber);
    assert(person->phoneNumber != NULL);

    return person;
}

char * getPhoneNumber(struct Person * person)
{
    return person->phoneNumber;
}

void setPhoneNumber(struct Person * person, char * phoneNumber)
{
    free(person->phoneNumber);
    person->phoneNumber = strdup(phoneNumber);
    assert(person->phoneNumber != NULL);
}