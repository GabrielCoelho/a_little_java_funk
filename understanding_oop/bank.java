/**
 * bank
 */
public class bank {
  int agency;
  int number;
  String ownerName;
  double amount;

  public static void main(String[] args) {
    bank account = new bank();

    account.agency = 112;
    account.number = 1287634;
    account.ownerName = "Gabriel Coelho Soares";
    account.amount = 8427.387;

    System.out.println("Owner: " + account.ownerName + " \nAgency number: " + account.number + " \tAccount Number: "
        + account.number + "\nAmount stored: R$ " + account.amount);

  }
}
