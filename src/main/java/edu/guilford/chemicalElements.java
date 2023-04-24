package edu.guilford;

import java.util.Random;

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

    //create a method that generates a random element
    public static chemicalElements randomElement() {
        //create an array of some of the elements
        chemicalElements[] allElements = new chemicalElements[26];
        //add elements to the array
        allElements[0] = new chemicalElements("Hydrogen", "H", 1, 1.00794);
        allElements[1] = new chemicalElements("Helium", "He", 2, 4.002602);
        allElements[2] = new chemicalElements("Lithium", "Li", 3, 6.941);
        allElements[3] = new chemicalElements("Beryllium", "Be", 4, 9.012182);
        allElements[4] = new chemicalElements("Boron", "B", 5, 10.811);
        allElements[5] = new chemicalElements("Carbon", "C", 6, 12.0107);
        allElements[6] = new chemicalElements("Nitrogen", "N", 7, 14.0067);
        allElements[7] = new chemicalElements("Oxygen", "O", 8, 15.9994);
        allElements[8] = new chemicalElements("Fluorine", "F", 9, 18.9984032);
        allElements[9] = new chemicalElements("Neon", "Ne", 10, 20.1797);
        allElements[10] = new chemicalElements("Sodium", "Na", 11, 22.98976928);
        allElements[11] = new chemicalElements("Magnesium", "Mg", 12, 24.305);
        allElements[12] = new chemicalElements("Aluminum", "Al", 13, 26.9815386);
        allElements[13] = new chemicalElements("Silicon", "Si", 14, 28.0855);
        allElements[14] = new chemicalElements("Phosphorus", "P", 15, 30.973762);
        allElements[15] = new chemicalElements("Sulfur", "S", 16, 32.065);
        allElements[16] = new chemicalElements("Chlorine", "Cl", 17, 35.453);
        allElements[17] = new chemicalElements("Argon", "Ar", 18, 39.948);
        allElements[18] = new chemicalElements("Potassium", "K", 19, 39.0983);
        allElements[19] = new chemicalElements("Calcium", "Ca", 20, 40.078);
        allElements[20] = new chemicalElements("Scandium", "Sc", 21, 44.955912);
        allElements[21] = new chemicalElements("Titanium", "Ti", 22, 47.867);
        allElements[22] = new chemicalElements("Vanadium", "V", 23, 50.9415);
        allElements[23] = new chemicalElements("Chromium", "Cr", 24, 51.9961);
        allElements[24] = new chemicalElements("Manganese", "Mn", 25, 54.938045);
        allElements[25] = new chemicalElements("Iron", "Fe", 26, 55.845);
        //randomly pull an element from the array
        Random rand = new Random();
        int randomElement = rand.nextInt(allElements.length);
        return allElements[randomElement];
    }
     

    //method to add the atomic weights of the elements in the array
    public static double sumAtomicWeights(chemicalElements[] elements) {
        double sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i].getAtomicWeight();
        }
        return sum;
    }



    }
