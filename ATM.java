import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int choice, pin = 0, n;
        long amount = 0, deposit = 0, withdraw = 0;
        Scanner sc = new Scanner(System.in);
        String transaction = "";
        int ID = 1902;
        do {
            System.out.println("\nEnter your id: ");
            ID = sc.nextInt();
            System.out.println("\nEnter your pin: ");
            pin = sc.nextInt();
            if (ID != 1902 || pin != 5478)
                System.out.println("please enter correct!");
        } while (ID != 1902 && pin != 5478);
        do {
            System.out.println("\n----Welcome----\n");

            System.out.println("1. Transaction");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.println("\n\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Transaction\n" + transaction);
                    break;
                case 2:
                    System.out.println("\nEnter amount to withdraw: ");
                    int b = sc.nextInt();
                    if (b % 100 != 0) {
                        System.out.println("\nEnter amount in multiple of 100");
                    } else if (b > (amount - 1000)) {
                        System.out.println("\nInsufficent balance");
                    } else {
                        amount = amount - b;
                        System.out.println("\n\nPlease receive cash");
                        System.out.println("Your current balance is: " + amount);
                    }
                    break;
                case 3:
                    System.out.println("\nEnter amount to Deposit: ");
                    int c = sc.nextInt();
                    amount = amount + c;
                    System.out.println("Your current balance is: " + amount);
                    break;
                case 4:
                    System.out.println("-----Transfer to the account-----"); {
                    Scanner s = new Scanner(System.in);
                    System.out.print("\nEnter Receipent Name: ");
                    String receipent = s.nextLine();
                    System.out.print("\nEnter amount to transfer: ");
                    float amount1 = s.nextFloat();

                    try {
                        if (amount >= amount1) {
                            if (amount1 <= 150000f) {
                                amount -= amount1;
                                System.out.println("\nTransfered to: " + receipent);
                                String str = amount1 + " : Rs transfered to : " + receipent + "\n";
                                transaction = transaction.concat(str);
                            } else {
                                System.out.println("\nINVALID TRANSFER..");
                            }
                        } else {
                            System.out.println("\nInsufficient Balance");

                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                case 5:
                    System.out.println(" \n\n Thank You.. \n\n ");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

    }
}