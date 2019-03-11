public class Main {

    public static void main(String[] args) {

        Banking client = new Banking("19238738NB2301", "Sameer Khan", "VIP", 93487d);       // d is for double type value.

        System.out.println("Client Name: " + client.getAccountHolder());
        System.out.println("Account Number: " + client.getAccountNumber());
        System.out.println("Type: " + client.getHolderType());
        System.out.println("Remaining Balance: " + client.getBalance());
        System.out.println("----After Transaction----");

        client.depositAmount(15000d);
        client.withdrawAmount(2100.87);

        System.out.println("Ultimate Balance: " + client.getBalance());
    }
}
