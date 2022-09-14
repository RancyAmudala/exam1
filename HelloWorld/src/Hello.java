
public class Hello{
	ElectricAccount acct = new ElectricAccount();
	public void useElectricity(double kwh) {
		acct.addkwh(kwh);
	}
	

}

public class ElectricAccount {
	private double kwh;
	private double rate = 0.07;
	private double bill;
	public void addkwh(double kwh) {
		if(kwh > 0) {
			this.kwh += kwh;
			this.bill = this.kwh*this.rate;
		}
	}
}

