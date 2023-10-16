namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Console.WriteLine("There were {0} arguments.", args.Length);

            foreach (string arg in args)
            {
                Console.WriteLine(arg);
            }

            Person captain = new Person("Jean-Luc Picard", "555-1111");
            Console.WriteLine(captain);

            // int a = 5;
            // if(a == captain)
            // {
            //     Console.WriteLine("a == captain");
            // }

            Person data = new Person("Data", "555-1234");

            //Person someone = captain + data;

        }

        static void Foo(int a, float b)
        {

        }

        static void Foo(string a, float b)
        {

        }
    }
}