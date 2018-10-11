import java.util.Scanner;
public class fact{
public static void main(String[] args){
	    int b=1;
	    int c=1;
        int a;
        Scanner obj =new Scanner(System.in);
        System.out.print("aapna number daalo");
        a=obj.nextInt();
         while (b<=a){
            c=c*b;
         b++;
         }
           System.out.println(c);




}

}