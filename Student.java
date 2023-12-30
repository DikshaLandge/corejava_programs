public class Student
{
      public void studentDetails(int roll,String name, String address,int mark)
      {
          System.out.println(roll+ " " +name+ " " +address +  " "+ mark);
      }
        public int getTotalMark(int x,int y,int z)
       {
          int total=x+y+z;
           return total;
         }
       public static void main(String args[])
       {
             Student stud=new Student();
            int op=stud.getTotalMark(60,47,75);
              System.out.println(op);
         stud.studentDetails(10,"tom","Cartoon Network",op);
        }
}
