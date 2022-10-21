import java.util.Scanner;  
class Day5  
{  
    public static void main(String args[])   
    {   
        System.out.println("Enter the value of a and b");  
        Scanner in = new Scanner(System.in);  
        int a = in.nextInt();  
        int b = in.nextInt();  
        System.out.println("before swapping numbers: "+a +" "+ b);    
        a = a + b;   
        b = a - b;   
        a = a - b;   
        System.out.println("After swapping: "+a +"  " + b);   
    }   
}
