public class BankAccount{
	private String name;
	private double checkings;
	private double savings;
	private String cardNumber;
	private int expDate; 
	private int securityNumber; 
	
	public BankAccount(){
		
	}
	
	public BankAccount(String n, double chk, double s){
		name = n;
		checkings = chk;
		savings = s; 
	}
	
	public BankAccount(String n){
		name = n;
	}
	
	
	public String getName(){
		return name;
	}
	public double getChecking(){
		return checkings;
	}
	public double getSavings(){
		return savings;
	}
	public String getCardNumber(){
		return cardNumber;
	}
	public int getExpDate(){
		return expDate;
	}
	public int getGecurityNumber(){
		return securityNumber;
	}
	
	
	
	public void setName(String n){
		name = n;
	}
	public void setCheckings(double chk){
		checkings = chk;
	}
	public void setSavings(double s){
		savings = s;
	}
	public void setCardNumber(String cn){
		cardNumber = cn;
	}
	public void setExpDate(int ed){
		expDate = ed;
	}
	public void setSecurityNumber(int sn){
		securityNumber = sn;
	}
	
	public void print(){
		System.out.println("Client name: " + name);
		System.out.println("Checkings: " + checkings);
		System.out.println("savings: " + savings);
		System.out.println("cardNumber: " + cardNumber);
		System.out.println("securityNumber: " + securityNumber);
		System.out.println("expDate:" + expDate);
		System.out.println(" ");
	}
	
}