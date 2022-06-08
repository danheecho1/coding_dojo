public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount wells = new BankAccount();

        wells.deposit("checking", 200.00);
        wells.deposit("savings", 500.00);

        wells.withdraw("checking", 50.00);
        wells.withdraw("savings", 150.00);

        wells.display();
    }
}