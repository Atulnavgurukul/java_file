import java.util.Scanner;
public class code2{
public static void main(String[] args){
     float a;
     Scanner obj = new Scanner (System.in);
     System.out.print("please enter quantity of water");
     a= obj.nextFloat();
     if (1>a) {
         System.out.println("aur paani bharna hai");  	
     }else if(1<a&&a<10){
          System.out.println("aur paani nahi bhrna hai");

     }else{
          System.out.println("pqaani overflow kar rha hai");
     }


}

}