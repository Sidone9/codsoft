import java.util.*;


class ATM{

   private static float Balance = 600000;
   int PIN = 6213;

   public void checkpin(){
    System.out.println(" Enter your PIN:");
    Scanner sc = new Scanner(System.in);
    int enterpin = sc.nextInt();
    if(enterpin == PIN){
        menu();
    }else{
        System.out.println(" Invalid PIN");
    }  
   }



   public void menu(){
    System.out.println("Enter Your Choice");
    System.out.println("1. Check A/C Balance");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Deposit Money");
    System.out.println("4. EXIT");

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();


    if(opt == 1){
        checkBalance();
    }else if(opt == 2){
        withdrawMoney();
    }else if(opt == 3){
        depositMoney();
    }else if(opt == 4){
        return;
    }else{
        System.out.println(" Enter a Valid Choice...");
    }
   }


   public void checkBalance(){
    System.out.println("Balance: " + Balance );
    menu();
   }

   public void withdrawMoney(){
    System.out.println(" Enter Amount to Withdraw:");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextInt();

    if(amount > Balance){
        System.out.println(" Insufficient Balance");
    }else{
        Balance = Balance - amount;
        System.out.println(" Money Withdrawl Successful");
    }

    menu();
   }


   public void depositMoney(){
    System.out.println("Enter the Amount:");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextInt();
    Balance = Balance + amount;
    System.out.println("Money Deposited Successfully");
    menu();
   }
}

public class ATM_Machine{
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin(); 
    }
}