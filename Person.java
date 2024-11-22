public class Person implements Comparable<Person> {
    private int age;
    private String name;
    private String address;
    private int zip;
    private double salary;

    // Default constructor with default values
    public Person() {
        this.age = 0;
        this.name = "Unknown";
        this.address = "Unknown";
        this.zip = 0;
        this.salary = 0.0;
    }

    // Parameterized constructor
    public Person(int age, String name, String address, int zip, double salary) {
        setAge(age);
        setName(name);
        setAddress(address);
        setZip(zip);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d $%,.2f%n", age, name, address, zip, salary);
    }

    // Getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Corrected compareTo method
    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getSalary(), o.getSalary());
    }
}

