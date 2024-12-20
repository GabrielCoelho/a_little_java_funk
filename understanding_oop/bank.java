/**
 * bank
 */
public class bank {
  private int agency;
  private int number;
  private PessoaFisica owner;
  private double amount;

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double value) {
    if (value < 0) {
      return;
    }
    this.amount = value;
  }

  public void deposit(double newDeposit) {
    this.amount += newDeposit;
  }

  public double withdraw(double value) {
    if (this.amount < value) {
      System.out.println("Insuficient founds");
      return 0;
    }
    this.amount -= value;
    return this.amount;

  }

  public boolean transfer(double value, bank destinyAccount) {
    double v = this.withdraw(value);
    if (v != 0) {
      destinyAccount.amount += value;
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    bank account = new bank();

    account.deposit(100);
    account.withdraw(1500);
    System.out.println(account.getAmount());
    account.setAmount(-1500);
    System.out.println(account.getAmount());
  }
}
