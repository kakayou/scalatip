package eight

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  private var balance =initialBalance;
  override def deposit(amount: Double): Double = {
    balance += amount;
    balance -= 1.0;
    balance;
  }

  override def withdraw(amount: Double): Double = {
    balance -= amount;
    balance -= 1.0;
    balance;
  }

}
