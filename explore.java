 import java.util.Scanner;

 public class explore
 {
     public static void main(String [] args)
     {
       Scanner sc = new Scanner (System.in );
       int a = sc.nextInt();
        
      for(int b = 2;b%a==0;a++ )
      {
        System.out.println("nota prime");
      }


     }

 }