
public class AccountingMethodApp {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		//만들어진 메소드를 호출하는 코드
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
		//메소드는 서로 연관된 코드를 그룹핑(모아서) 해서 이름을 붙힌 정리정돈된 상자다
		
		
		//메소드를 만드는 코드
		print();
	}
	public static void print() {
		System.out.println("Value Of supply :"+valueOfSupply);//double 형
		System.out.println("VAT :"+ getVAT());
		System.out.println("Total :"+ getTotal());
		System.out.println("Expense :"+ getExpense());
		System.out.println("Income :"+ getIncome());
		System.out.println("Dividend 1:"+ getDiviend1());
		System.out.println("Dividend 2:"+ getDiviend2());
		System.out.println("Dividend 3:"+ getDiviend3());
	}
	public static double getDiviend1() {
		return getIncome() * 0.5;
	}
	public static double getDiviend2() {
		return getIncome() * 0.3;
	}
	public static double getDiviend3() {
		return getIncome() * 0.2;
	}
	public static double getIncome() {
		return valueOfSupply - getExpense();
	}
	public static double getExpense() {
		return valueOfSupply*expenseRate;
	}
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	private static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
