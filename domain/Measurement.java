package domain;

public class Measurement {
   private int value;       // величина
   private String unit;     //единица измерения
   
    Measurement(int value, String unit) {
	
	this.value = value;
	this.unit = unit;
}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return " [value=" + value + ", unit=" + unit + "]";
	}
    
   
   
}
