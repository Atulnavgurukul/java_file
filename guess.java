import java.util.Scanner;
public class guess{
public static void main(String[] args){
      int a;
      int c=3;
      int b=0;
      while(b<6){
      Scanner obj=new Scanner(System.in);
      System.out.print("aapna number daalo");
      a= obj.nextInt();
          if (a==c){
               System.out.println("your answer is right");
               break;
          } else{
               System.out.println("you are wrong");
          b++;     
          }
          
      }


}
}