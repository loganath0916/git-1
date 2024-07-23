class student
{
    int rollno ;
    String name ;
    int mark ;
}
public class explore {
    public static void main(String a[])
    {
       student s1 = new student();
        s1.rollno = 1;
        s1.name = "logu";
        s1.mark =50;

        student s2 = new student();
        s2.rollno = 2;
        s2.name = "loves";
        s2.mark =50;

        student s3 = new student();
        s3.rollno = 3;
        s3.name = "varsha";
        s3.mark =50;

        student stu [] = new student [5];
        stu [0] = s1;
        stu [1] = s2;
        stu [2] = s3;


     for ( int i=0; i<stu.length; i++)
    {
     System.out.println(stu[i].rollno + "." + stu[i].name + ":" + stu[i].mark ); 
    }
 }


}
