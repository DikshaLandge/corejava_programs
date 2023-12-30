public class Num
{
   public void evenodd(int limit)
  {
    for(int i=0; i<limit; i++)
     {
          if(i%2==0)
          {
          System.out.println(i+"number is even");
          }
          else{
           System.out.println(i+"number is Odd");
             }
     } 

  }

   public static void main(String args[])
   {
 
    Num n=new Num();
    n.evenodd(50);
}
}