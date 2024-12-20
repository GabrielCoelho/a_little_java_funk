/**
 * bank
 */
public class bank {
  private int agency;
  private int number;
  private PessoaFisica owner;
  private double amount;

  // Getters
  public double getAmount() {
    return this.amount;
  }

  public int getAgency() {
    return this.agency;
  }

  public int getNumber() {
    return this.number;
  }

  public PessoaFisica getOwner() {
    return this.owner;
  }

  // Setters
  public void setAmount(double value) {
    if (value < 0) {
      return;
    }
    this.amount = value;
  }

  public void setAgency(int value) {
    this.agency = value;
  }

  public void setNumber(int value) {
    this.number = value;
  }

  public void setOwner(PessoaFisica newPessoa) {
    this.owner = newPessoa;
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
    PessoaFisica p1 = new PessoaFisica();

    p1.setName("Gabriel");
    p1.setSurname("Coelho Soares");
    p1.setCPF("1234758890");
    p1.setJobTitle("Developer");
    p1.setMonthlySalary(2500);

    account.setOwner(p1);
    account.setAgency(112);
    account.setNumber(12709847);
    account.deposit(2500);

    System.out.println(account.getOwner().getName() + " " + account.getOwner().getSurname());
    System.out.println(account.getAgency() + " - numb. " + account.getNumber());
    System.out.println(account.getAmount());
  }
}
