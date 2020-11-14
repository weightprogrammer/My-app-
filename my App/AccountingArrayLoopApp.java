
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble( args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expenes = valueOfSupply*expenseRate;
		double income = valueOfSupply - expenes;
		
		
		
		
		
		
		System.out.println("Value Of supply :"+valueOfSupply);//double 형
		System.out.println("VAT :"+ vat);
		System.out.println("Total :"+ total);
		System.out.println("Expense :"+ expenes);
		System.out.println("Income :"+ income);
		
		double [] dividendRates = new double[3];
		dividendRates[0] =0.5;
		dividendRates[1] =0.3;
		dividendRates[2] =0.2;
		
		
		//반복문 배열과 단짝(매우중요 복습 또복습)
		int i = 0;
		while(i < dividendRates.length) {
		System.out.println("Dividend 1:"+ income * dividendRates[i]);
		i = i + 1;
		}

	}

}
