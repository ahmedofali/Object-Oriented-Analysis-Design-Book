public class index {

    public static void main(String[] args)
    {
        StudentList list = new StudentArrayList(2 );

        for( int i = 0 ; i < 10 ; i++ )
        {
            Student student = new Student( "Welcome " + i );

            list.add( student );
        }
    }

}
