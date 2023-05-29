public class StudentAccount extends Account{
  public StudentAccount(String IBAN, String swift, double amount, String name, int customerId) {
    super(IBAN, swift, amount, name, customerId);
  }

  public StudentAccount(String name, int customerId) {
    super(name, customerId);
  }
}
