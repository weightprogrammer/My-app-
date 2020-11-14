
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble( args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expenes = valueOfSupply*expenseRate;
		double income = valueOfSupply - expenes;
		
		//배열...서로연관된 데이터를 정리정돈하는것이 배열!
		
		double [] dividendRates = new double[3];
		dividendRates[0] =0.5;
		dividendRates[1] =0.3;
		dividendRates[2] =0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		
		System.out.println("Value Of supply :"+valueOfSupply);//double 형
		System.out.println("VAT :"+ vat);
		System.out.println("Total :"+ total);
		System.out.println("Expense :"+ expenes);
		System.out.println("Income :"+ income);
		System.out.println("Dividend 1:"+ dividend1);
		System.out.println("Dividend 2:"+ dividend2);
		System.out.println("Dividend 3:"+ dividend3);

	}

}
