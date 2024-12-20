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
}
