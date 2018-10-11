import java.util.Scanner;
public class div1{
public static void main(String[] args){
         float v;
         float b;
         Scanner obj =new Scanner(System.in);
         System.out.print("please enter frist number");
         v=obj.nextFloat();

         System.out.print("please enter another number");
         b=obj.nextFloat();
         if (v%b==0){
             System.out.println("number divisible hai");
         }else{
             System.out.println("number divisible nahi hai");
         }

}

}