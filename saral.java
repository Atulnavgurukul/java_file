import java.util.Scanner;
class saral  {
public static void main(String[] args) {
		
	  String m;
	  Scanner obj = new Scanner(System.in);
	  System.out.print("pahla number daalo");
	  m= obj.nextLine();
       int length = m.length();
       System.out.println(length);

       if (length<5){
       	   System.out.println("aapki name ki length bhut chhoti hai");
       }else{

       	   System.out.println("aapka naam kafi bada hai");
       }

        
}
}