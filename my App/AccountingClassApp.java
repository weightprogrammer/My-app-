
		//메소드는 서로 연관된 코드를 그룹핑(모아서) 해서 이름을 붙힌 정리정돈된 상자다
		//메소드를 만드는 코드
		//인스턴스는 클래스를 복제하여 버그가 적게 코딩하게 하는 방법
class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	public void print() {
		System.out.println("Value Of supply :"+valueOfSupply);//double 형
		System.out.println("VAT :"+ getVAT());
		System.out.println("Total :"+ getTotal());
		System.out.println("Expense :"+ getExpense());
		System.out.println("Income :"+ getIncome());
		System.out.println("Dividend 1:"+ getDiviend1());
		System.out.println("Dividend 2:"+ getDiviend2());
		System.out.println("Dividend 3:"+ getDiviend3());
	}
	public  double getDiviend1() {
		return getIncome() * 0.5;
	}
	public  double getDiviend2() {
		return getIncome() * 0.3;
	}
	public  double getDiviend3() {
		return getIncome() * 0.2;
	}
	public  double getIncome() {
		return valueOfSupply - getExpense();
	}
	public  double getExpense() {
		return valueOfSupply*expenseRate;
	}
	public  double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	private  double getVAT() {
		return valueOfSupply*vatRate;
	}
}

public class AccountingClassApp {
	
	public static void main(String[] args) {
		//만들어진 메소드를 호출하는 코드
//		Accounting.valueOfSupply = 10000.0;
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		Accounting.print();
//		
//		Accounting.valueOfSupply = 20000.0;
//		Accounting.vatRate = 0.05;
//		Accounting.expenseRate = 0.2;
//		Accounting.print();
//		
//		Accounting.valueOfSupply = 10000.0;
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.45;
//		Accounting.print();
//		Accounting1.valueOfSupply = 10000.0;
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;
//		Accounting1.print();
//		
//		Accounting2.valueOfSupply = 20000.0;
//		Accounting2.vatRate = 0.05;
//		Accounting2.expenseRate = 0.2;
//		Accounting2.print();
//		
//		Accounting1.print();
//		
		
		
		//인스턴스(instance)
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.2;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.1;
		a2.print();
	}
	

}
