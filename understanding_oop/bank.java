/**
 * bank
 */
public class bank {
  int agency;
  int number;
  PessoaFisica owner;
  double amount;

  void deposit(double newDeposit) {
    this.amount += newDeposit;
  }

  double withdraw(double value) {
    if (this.amount < value) {
      System.out.println("Insuficient founds");
      return 0;
    }
    this.amount -= value;
    return this.amount;

  }

  boolean transfer(double value, bank destinyAccount) {
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

    p1.name = "Gabriel";
    p1.cpf = "12345678900";
    p1.surname = "Coelho Soares";
    p1.jobTitle = "Developer";
    p1.monthlySalary = 2500;

    account.agency = 112;
    account.number = 1287634;
    account.owner = p1;
    account.amount = 8427.387;

    System.out.println("Owner: " + account.owner.name + " \nAgency number: " + account.number + " \tAccount Number: "
        + account.number + "\nAmount stored: R$ " + account.amount);

    account.deposit(1500);
    System.out.println("Owner: " + account.owner.name + " \nAgency number: " + account.number + " \tAccount Number: "
        + account.number + "\nAmount stored: R$ " + account.amount);

    double s = account.withdraw(300);
    System.out.println(s);

    s = account.withdraw(2198347);

    bank newTest = new bank();

    account.transfer(3000, newTest);

    System.out.println(newTest.amount);
  }
}
