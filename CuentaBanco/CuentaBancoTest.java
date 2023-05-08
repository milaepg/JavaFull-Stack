public class CuentaBancoTest {
	public static void main(String[] args) {
		
	CuentaBanco user1 = new CuentaBanco();
	CuentaBanco user2 = new CuentaBanco();
	CuentaBanco user3 = new CuentaBanco();
	user1.accountDeposit("Savings", 60.00);
	user2.accountDeposit("checking", 500.00);
	user3.accountDeposit("savings", 2000.50);
	user1.accountWithdrawal("Checking", 70.00);
	user2.accountWithdrawal("checking", 200.00);
	user3.accountWithdrawal("savings", 1000.00);
	user2.myBalance();
	user1.myBalance();
	user3.myBalance();
	}
}
