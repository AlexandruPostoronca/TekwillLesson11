import java.util.Scanner;

public class Main {

    /**
     * The method changes the balance of the given account according to an operation.
     *
     * @param account   the account to change the balance for.
     * @param operation the operation to perform.
     * @return <code>true</code> if the balance has changed, otherwise - <code>false</code>.
     */
    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        // write your implementation here
        boolean sold = false;
        if (Operation.DEPOSIT.equals(operation)) {
            account.setBalance(account.getBalance() + sum);
            sold = true;
        }
        if (Operation.WITHDRAW.equals(operation)) {
            if (account.getBalance() >= sum) {
                account.setBalance(account.getBalance() - sum);
                sold=true;
            }else System.out.println("Not enough money to withdraw.");
        }
        return sold;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        System.out.println(changeBalance(account, operation, sum) + " " + account.getBalance());
    }
}