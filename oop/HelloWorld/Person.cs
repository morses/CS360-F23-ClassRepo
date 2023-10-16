namespace HelloWorld;

public class Person : Object
{
    private string _fullName;
    public string FullName
    {
        get { return _fullName; }
        set { _fullName = value; }
    }

    public string PhoneNumber { get; set; }

    public static string HomePlanet { get; } = "Earth";

    public Person(string fullName, string phoneNumber)
    {
        _fullName = fullName;
        PhoneNumber = phoneNumber;
    }

    public override string ToString()
    {
        return $"{_fullName} - {PhoneNumber}";
    }
}