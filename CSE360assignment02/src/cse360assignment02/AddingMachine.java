package cse360assignment02;

//https://github.com/AlecWarong/CSE360Assignment01VersionControl-.git

public class AddingMachine {

    private int total;
    private String toString = "0";

    public AddingMachine() {

        total = 0;  // not needed - included for clarity
    }

    public int getTotal() {
        return total;
    }

    public void add(int value) {
        toString += " + " + value ;
        total = total + value;
    }

    public void subtract(int value) {
        toString += " - " + value;
        total = total - value;
    }

    public String toString() {
        return toString;
    }

    public void clear() {
    	total = 0;
    }
}

