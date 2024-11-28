import java.util.Scanner;
public class LAB5Q2{
public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("enter the number of new members introdicter:");
    int numMembers=scanner.nextInt();

    if (numMembers<0){
        System.out.println("input must be a number 0 or greater");
    }

    else{
	String prize;
	switch(numMembers) {
        case 0:
            System.out.println("No prize");
            break;
        case 1:
            System.out.println("prize is a:pen");
            break;
        case 2:
            System.out.println("prize is a:umbrella");
            break;
        case 3:
            System.out.println("prize is a:bag");
            break;
        case 4:
            System.out.println("prize is a:Travelling chair");
            break;
        default:
            System.out.println("prize is a:Headphone");
     }
            scanner.close();
    }
}
  }       