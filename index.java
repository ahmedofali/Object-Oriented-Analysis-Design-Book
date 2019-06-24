public class index {

    public static void main(String[] args)
    {
        Student student1 = new Student("Ahmed");
        student1.setAddress("1 Main Street");

        // some other code
        Student student2 = new Student("Ali");
        student2.setAddress("1 Main Street");

        // more code
        if (student1.equals(student2)) {
            System.out.println("student1 is the same as student2");
        } else {
            System.out.println("student1 is not the same as student2");
        }
    }

}
