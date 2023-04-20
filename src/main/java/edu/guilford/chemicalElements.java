package edu.guilford;


public class chemicalElements {
    //attributes
    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    //constructors
    public chemicalElements(String name, String symbol, int atomicNumber, double atomicWeight) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }
    //making an element constructor that sets random values 



    //getters
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public void setAtomicWeight(double atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    //toString method
    @Override
    public String toString() {
        return "chemicalElements{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                ", atomicWeight=" + atomicWeight +
                '}';
    }
    
}
