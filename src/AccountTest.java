public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Puntira", (double)1000);
        System.out.println("Name : " +account.getName());
        System.out.println("Balance : " +account.getBalance());
    }
}
