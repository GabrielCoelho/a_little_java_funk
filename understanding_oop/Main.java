/**
 * main
 */
public class Main {
  public static void main(String[] args) {
    PessoaFisica ownerValue = new PessoaFisica("Gabriel", "Coelho Soares", "12394087789");
    AccountCurrent newAccountC = new AccountCurrent(1200, 10982347, ownerValue);
    AccountInvestment newAccountI = new AccountInvestment(1200, 10982348, ownerValue);

    newAccountC.deposit(1000);
    newAccountI.deposit(10000);

    newAccountC.withdraw(100);
    newAccountI.withdraw(1000);

    System.out.println("Current Account: R$ " + newAccountC.getAmount());
    System.out.println("Investment Account: R$" + newAccountI.getAmount());
  }
}
