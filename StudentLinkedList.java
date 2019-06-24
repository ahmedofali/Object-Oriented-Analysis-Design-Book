public class StudentLinkedList implements StudentList
{
    private StudentNode head;

    private class StudentNode {

        private Student student;

        private StudentNode next;

        public StudentNode(Student student, StudentNode nextNode)
        {
            this.student = student;

            next = nextNode;
        }

        public Student getData()
        {
            return student;
        }

        public void setStudent(Student student)
        {
            this.student = student;
        }

        public StudentNode getNext()
        {
            return next;
        }

        public void setNext(StudentNode node)
        {
            next = node;
        }
    }

    public void add(Student student)
    {
        head = new StudentNode(student, head);
    }

    public void delete(String studentName)
    {
        if (head == null) {
            return;
        }
        if (head.getData().getName().equals(studentName)) {
            head = head.getNext();
        } else {
            for (StudentNode temp = head.getNext(), previous = head;
                 temp != null; temp = temp.getNext()) {
                if (temp.getData().getName().equals(studentName)) {
                    previous.setNext(temp.getNext());
                    return;
                }
            }
        }
    }

    public void print()
    {
        System.out.print("List: ");

        for ( StudentNode temp = head; temp != null; temp = temp.getNext() )
        {
            System.out.print(temp.getData() + " ");
        }

        System.out.println();
    }
}