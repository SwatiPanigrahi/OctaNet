import java.util.Scanner;
public class Atm
{
public static void main(String args[])
{
int balance = 20000, withdraw, deposit;
  {
  System.out.println("Automated Teller Machine\n");
  try (Scanner pin = new Scanner(System.in)) {
    System.out.print("Enter your PIN: ");
    int PIN = pin.nextInt();
    if(PIN!=2423)
    System.out.println("Enter a valid PIN! ");
    else
    while(true)
      {
      System.out.print("Select the type of Transaction: \n");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit amount");
      System.out.println("3. Withdraw amount");
      System.out.println("4. Exit");
      try (Scanner ATM = new Scanner(System.in)) {
        int Choice = ATM.nextInt();
          switch(Choice)
          {
          case 1:
          System.out.println("Your balance is: " +balance);
          System.out.println("");
          break;
          case 2:
          System.out.println("Enter the amount to be deposited: ");
          deposit = ATM.nextInt();
          balance = balance + deposit;
          System.out.println("Your money has been successfully deposited: ");
          System.out.println(" ");
          break;
          case 3:
          System.out.println("Enter the amount to be withdrawn: ");
          withdraw = ATM.nextInt();
          if(balance>=withdraw)
           {
           balance = balance - withdraw;
           System.out.println("Your money has been successfully withdrawn: ");
           }
           else
           {
           System.out.println("Insufficient balance");
           }
           System.out.println("");
           break;
          case 4:
          System.exit(0);
          }
      }
      }
  }
  }
}
}