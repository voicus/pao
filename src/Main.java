import java.util.*;

public class Main {

  static List<String> availableCommands = Arrays.asList("create_customer", "create_customer_card", "get_customer", "get_customer_amount", "get_customer_accounts", "load_customer_account", "create_transaction", "create_customer_account", "create_student_account", "close_customer_account", "get_customer_transactions", "help", "end");

  private static void printAllCommands(){
    for(int i=0;i<availableCommands.size();++i)
      System.out.println((i+1) + ". (" + availableCommands.get(i) + ")");
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean end = false;
    MainService mainService = new MainService();
    while (!end){
      System.out.println("Insert command: (help - see commands)");
      String command = in.nextLine().toLowerCase(Locale.ROOT);
      try{
        switch (command) {
          case "create_customer" -> mainService.createCustomer(in);
          case "create_customer_card" -> mainService.createCustomerCard(in);
          case "get_customer" -> mainService.getCustomer(in);
          case "get_customer_amount" -> mainService.getCustomerAmount(in);
          case "get_customer_accounts" -> mainService.getCustomerAccounts(in);
          case "get_customer_account" -> mainService.getCustomerAccount(in);
          case "load_customer_account" -> mainService.loadCustomerAccount(in);
          case "create_transaction" -> mainService.createTransaction(in);
          case "create_customer_account" -> mainService.createCustomerAccount(in);
          case "create_student_account" -> mainService.createStudentAccount(in);
          case "close_customer_account" -> mainService.closeAccount(in);
          case "get_customer_transactions" -> mainService.getCustomerTransactions(in);
          case "help" -> Main.printAllCommands();
          case "end" -> end = true;
        }
      }catch (Exception e){
        e.printStackTrace();
      }
    }
  }
}
