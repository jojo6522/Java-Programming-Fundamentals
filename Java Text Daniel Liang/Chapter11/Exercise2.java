public class Person {
    protected String name;
    protected String address;
    protected String phonenumber;
    protected String email;

    public Person(String name, String address, String phonenumber, String email)
    {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;

    }

    public String toString()
    {
        return "Name: " + name + "\n" + "Address: " + address + "\n";
    }

}

public class Student extends Person {
    private String status;

    public Student(String name, String address, String phonenumber, String email, String status)
    {
        super(name, address, phonenumber, email);
        this.status = status;
    }

    public String toString()
    {
        return super.toString() + "Status: " +  status +"\n";
    }
}

public class Employee extends Person{

    protected String office;
    protected double salary;
    protected MyDate datehired;

    public Employee(String name, String address, String phonenumber, String email, String office, double salary)
    {
        super(name, address, phonenumber, email);
        this.office= office;
        this.salary = salary;
        datehired = new MyDate();
    }


    public String toString()
    {
        return super.toString() + "Office: " + office + "\n" + "Salary: " + salary + "\n" + "Date Hired: " + datehired + "\n";
    }

}
    public  Faculty(String name, String address, String phonenumber, String email, String office, double salary, String officehours, String rank)
    {
        super(name,  address, phonenumber, email, office, salary);
        this.officehours = officehours;
        this.rank = rank;
    }

    public String toString()
    {
        return super.toString() + "Office Hours: " + officehours + "\n" + "Rank: " + rank + "\n";
    }
}


public class Staff extends Employee {

    private String title;

    public  Staff(String name, String address, String phonenumber, String email, String office, double salary, String title)
    {
        super(name,  address, phonenumber, email, office, salary);
        this.title = title;

    }

    public String toString()
    {
        return super.toString() + "Title: " + title + "\n";
    }

    public static void main(String[] args)
    {
        Person p1= new Person("Ashley", "Waterford", "876-888-7777", "jade@hotmail.com");
        Student s1= new Student("Sasha", "Cedar Valley", "876-876-8974", "het@gmail.com", "freshman");
        Employee e1 = new Employee("Christano", "MeadowValley", "879-908-7089", "join@love.com", "Scotia", 80000.00);
        Faculty f1= new Faculty("Jayden", "Dern Valley", "900-890-9000", "jim@red.com", "JMMB", 109000.90, "40", "high");

        System.out.println(p1);
        System.out.println(s1);
        System.out.println(e1);
        System.out.println(f1);

}



import java.util.GregorianCalendar;

// Implement MyDate class
public class MyDate {
    // Data Fields
    private int year;
    private int month;
    private int day;

    /** Creates a MyDate object for the current date */
    MyDate() {
        GregorianCalendar calander = new GregorianCalendar();
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }

    /** Creates a MyDate object with a specified elapsed time
     *	 since midnight, January 1, 1970, in milliseconds */
    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    /** Creates a MyDate object with the
     *   specified year, month, and day */
    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString()
    {
        return year + "/" + month + "/" + day;
    }

    /** Return year */
    public int getYear() {
        return year;
    }

    /** Return month */
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    /** Return day */
    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    /** Sets a new date for the object using the elapsed time */
    public void setDate(long elapsedTime) {
        GregorianCalendar calander = new GregorianCalendar();
        calander.setTimeInMillis(elapsedTime);
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
