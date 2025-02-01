public class BankAccount {
    public static void main(String[] args){
        // Starting balance
        float balance = 2175.37f;

        balance = balance - 302.50f; // withdrew $302.50
        balance = balance + 50.03f; // deposited $50.03
        balance = (balance/2) + 20.00f; // withdrew half and deposited $20.00
        balance = balance - 1.00f; // withdrew $1.00
        balance = balance*2.00f; // deposited and doubled the balance
        balance = balance + 1.00f; // deposited $1.00
        // Formatted text of balance displayed until its hundredth decimal value
        String formattedVal = String.format("%.2f", balance);

        System.out.println("Bob's balance after all transactions: " + formattedVal);
    }
}
