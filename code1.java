import java.util.Scanner;
public class code1{
public static void main(String[] args) {
	   float a;
	   Scanner obj = new Scanner (System.in);
	   System.out.print("enter a number");
	   a = obj.nextFloat();
	   if(a<10){

             System.out.println("10 se chhota");

	   }

	   else if(10<a&&a<20){
             System.out.println("20 se chhota hai");

	   }else{
             System.out.println("20 se bada hai");
	   }




}
}
