public class PessoaFisica {
  private String name;
  private String surname;
  private String cpf;
  private String jobTitle;
  double monthlySalary;

  // Constructor
  public PessoaFisica(String nameValue, String surnameValue, String cpfValue) {
    this.name = nameValue;
    this.surname = surnameValue;
    this.cpf = cpfValue;
  }

  // Getters

  public String getName() {
    return this.name;
  }

  public String getSurname() {
    return this.surname;
  }

  public String getCPF() {
    return this.cpf;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public double getMonthlySalary() {
    return this.monthlySalary;
  }

  // Setters

  public void setName(String value) {
    this.name = value;
  }

  public void setSurname(String value) {
    this.surname = value;
  }

  public void setCPF(String value) {
    this.cpf = value;
  }

  public void setJobTitle(String value) {
    this.jobTitle = value;
  }

  public void setMonthlySalary(double value) {
    this.monthlySalary = value;
  }

}
