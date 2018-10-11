import java.util.Scanner;
public class last{
public static void main(String[] args){
     int a;
     Scanner obj =new Scanner(System.in);
     System.out.print("appna age daalo");
     a=obj.nextInt();
     if (a<=5){
        System.out.println("ab tum school ja skte ho");

     }else if(a>5&&a<=10){
        System.out.println("ab tum cricket khel skte ho");
        System.out.println("ab tum school ja skte ho");

     }else if(10<a&&a<=18){
     	System.out.println("ab tum school ja skte ho");
     	System.out.println("ab tum cricket khel skte ho");
        System.out.println("ab tum vote de skte ho");

     }else if(a>18&&a<=20){
     	System.out.println("ab tum school ja skte ho");
     	System.out.println("ab tum cricket khel skte ho");
        System.out.println("ab tum saadi kr skte ho");
        System.out.println("ab tum vote de skte ho");
     }else {
     	System.out.println("ab tum school ja skte ho");
     	System.out.println("ab tum cricket khel skte ho");
        System.out.println("ab tum saadi kr skte ho");
        System.out.println("ab tum vote de skte ho");
        System.out.println("tum saadi kr sakte ho");

        

          
     }



}
}