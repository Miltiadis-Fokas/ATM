/**
 *
 * @author Miltiadis Fokas
 */
import java.util.Scanner;
 class Main {
 static double currentBal =1000;
static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
    int selection;
        System.out.print("Welcome to the ATM\n");
        System.out.println("Select from the following menu options below:\n");
        System.out.println("| [1]  Check Balance   |");
        System.out.println("| [2]  Withdrawal      |");
        System.out.println("| [3]  Deposit         |");
        System.out.println("| [4]  Exit            |");
        System.out.print("Please select your option : ");
        selection =input.nextInt();
switch (selection){
    case 1:
        viewBalance();
        break;
    case 2:
        withdrawFunds();
        break;
    case 3:
        deposit();
        break;
    case 4:
        System.out.println("Thank you for using ATM! \n Goodbye! \n");
}
}
public static void viewBalance() {
    int selection1;
    System.out.println("You have selected Balance.\n");
    System.out.println("\t-- Your Current Balance is:$ " + currentBal);
    System.out.println("Return to main menu? \n [1] for YES \n");
    selection1 =input.nextInt();
switch (selection1){
    case 1:
        mainMenu();
        break;
}
}
public static void withdrawFunds() {
    int withdrawSelection;
    System.out.println("Amount to withdraw: ");
    System.out.println("[1] - $20");
    System.out.println("[2] - $40");
    System.out.println("[3] - $50");
    System.out.println("[4] - $100");
    System.out.println("[5] - MAIN MENU");
    System.out.print("Please select your option now: ");
    withdrawSelection =input.nextInt();
switch (withdrawSelection){
    case 1:
        Withdrawal(20);
        mainMenu();
        break;
    case 2:
        Withdrawal(40);
        mainMenu();
        break;
    case 3:
        Withdrawal(50);
        mainMenu();
        break;
    case 4:
        Withdrawal(100);
        mainMenu();
        break;
    case 5:
        mainMenu();
        break;
}
}
private static void mainMenu() {
	
}
public static void Withdrawal(int withdrawFunds){
    currentBal = currentBal -withdrawFunds;
    System.out.println("Your Balance now is: "+currentBal);
    System.out.println("Please take your funds.");
}
public static void deposit(){
    int addSelection;
    System.out.println("Amount to deposit: ");
    System.out.println("[1] - $20");
    System.out.println("[2] - $40");
    System.out.println("[3] - $50");
    System.out.println("[4] - $100");
    System.out.println("[5] - MAIN MENU");
    System.out.print("Please select your option now: ");
    addSelection =input.nextInt();
    switch (addSelection){
    case 1:
        accountAdd(20);
        mainMenu();
        break;
    case 2:
        accountAdd(40);
        mainMenu();
        break;
    case 3:
        accountAdd(50);
        mainMenu();
        break;
    case 4:
        accountAdd(100);
        mainMenu();
        break;
    case 5:
        mainMenu();
        break;
}
}
public static void accountAdd (int depositFunds){
    currentBal = currentBal +depositFunds;
    System.out.println("Your Balance now is: "+currentBal);
    System.out.println("Thank you.");
}
    
}