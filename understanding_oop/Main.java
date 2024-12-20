/**
 * main
 */
public class Main {
  public static void main(String[] args) {
    PessoaFisica ownerValue = new PessoaFisica("Gabriel", "Coelho Soares", "12394087789");
    AccountCurrent newAccountC = new AccountCurrent(1200, 10982347, ownerValue);
    AccountInvestment newAccountI = new AccountInvestment(1200, 10982348, ownerValue);

    System.out.println(newAccountC.getOwner().getName() + " " + newAccountC.getOwner().getSurname());
    newAccountC.deposit(2500);
    System.out.println(newAccountC.getAmount());

    System.out.println(newAccountI.getOwner().getName() + " " + newAccountI.getOwner().getSurname());
    newAccountI.deposit(400);
    System.out.println(newAccountI.getAmount());
  }
}
