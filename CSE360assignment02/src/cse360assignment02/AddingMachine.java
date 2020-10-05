package cse360assignment02;

public class AddingMachine {
  private int total;
  private String toString;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    toString = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  toString += "+" + value;
  }

  public void subtract (int value) {
	  total = total - value;
	  toString += "-" + value;
  }

  public String toString () {
    return toString;
  }

  public void clear() {
  }
}
