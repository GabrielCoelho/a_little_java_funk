/**
 * AccountCurrent
 */
public class AccountCurrent extends Bank {

  // Constructor
  public AccountCurrent(int agencyValue, int numberValue, PessoaFisica ownerValue) {
    super(agencyValue, numberValue, ownerValue);
  }

  @Override
  public double withdraw(double value) {
    double newValue = value + 0.98;
    return super.withdraw(newValue);
  }

  @Override
  public String toString() {
    return "Account{" + "Agency: " + this.getAgency() + ", Number: " + this.getNumber() + ", Owner: " + this.getOwner()
        + "Amount: R$ " + this.getAmount() + "}";
  }

  @Override
  public void generateReport() {
    // TODO Auto-generated method stub
    System.out.println("Generating report...");
  }

}
