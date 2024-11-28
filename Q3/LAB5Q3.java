import java.util.Scanner;
public class LAB5Q3{
public static final double ROOM_CHARGE = 48000.0;
public static final int MIN_DAYS_FOR_DISCOUNT = 3;
public static final int MIN_DAYS_FOR_HIGHER_DISCOUNT = 5;

public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter start Date (1-31):");
    int startDate = scanner.nextInt();
    System.out.print("Enter the End Date (1-31):");
    int endDate = scanner.nextInt();

    If(startDate<1 || startDate>31|| endDate<1||endDate>31);{
        System.out.println("error: Days must be between 1 and 31");
	return;
    }elseif ( startDate>=endDate);
  System.out.println("error: Start Date must be less than end Date");
  	return;
          }

int numDays = endDate-startDate;

double discountRate = 0;
 if(numDays>= MIN_DAYS_FOR_HIGHER_DISCOUNT); {
discountRate=0.2;
        } else (numDays>=MIN_DAYS_FOR_DISCOUNT); {
discountRate=0.1;
        }


double totalAmount = ROOM_CHARGE * numDays * (1-discountRate);
 System.out.println("Room Charge Per Day:Rs " + ROOM_CHARGE+"/=");
 System.out.println("Number ofDays Reserved: " + numDays);
  System.out.println(" Total Amount to be paid: " + totalAmount);

        scanner.close();
  }
          }
	}
}
	}