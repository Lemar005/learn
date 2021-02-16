package domain;

public class Price {
	
    private int value;
    private String currency;
    
    
    
     Price(int value, String currency) {
		
		this.value = value;
		this.currency = currency;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return " [value=" + value + ", currency=" + currency + "]";
	}
    
    
}
