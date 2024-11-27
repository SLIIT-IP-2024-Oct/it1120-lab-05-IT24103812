import java.util.Scanner;
public class LAB5Q1{
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.print("enter the first integers");
        int num1=scanner.nextInt();

        System.out.print("enter the second integers");
        int num2=scanner.nextInt();

        System.out.print("enter the third integers");
        int num3=scanner.nextInt();

        int smallest=Math.min(num1,Math.min(num2,num3));
        int largest=Math.max(num1,Math.max(num2,num3));

        System.out.println("the smallest number is"+smallest);
        System.out.println("the largest number is"+largest);

        scanner.close();
    }
}