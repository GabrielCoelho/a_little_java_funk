/**
 * AccountInvestment
 */
public class AccountInvestment extends Bank {

  public AccountInvestment(int agvalue, int numberValue, PessoaFisica ownerValue) {
    super(agvalue, numberValue, ownerValue);
  }

  @Override
  public void generateReport() {
    // TODO Auto-generated method stub
    System.out.println("Generating report...");
  }

}
