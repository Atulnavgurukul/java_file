public class food{
public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
        length = RemoveDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
 
}
}  