public class Student {

    private String name;
    private String address;
    private double gpa;

    public Student(String studentName)
    {
        this.name = studentName;
    }

    public Student(String studentName, String Address)
    {
        this.name = studentName;
        this.address = Address;
    }

    public boolean equals( Student student )
    {
        return student.name.equals(this.name) &&  student.address.equals(this.address);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public double computeGpa()
    {
        return this.gpa;
    }
}
