package edu.guilford;

/**
 * Hello world!
 *
 */
public class Elements 
{
    public static void main( String[] args )
    {
        //instantiating a chemicalElements object using the constructor 
        chemicalElements hydrogen = new chemicalElements("Hydrogen", "H",
                 1, 1.00794);

        //printing out the toString method of the hydrogen object
        System.out.println(hydrogen.toString());

        //creating an array
        chemicalElements[] elements = new chemicalElements[118];

        //adding elements to the array
        elements[0] = new chemicalElements("Hydrogen", "H", 1, 1.00794);
        elements[1] = new chemicalElements("Helium", "He", 2, 4.002602);
        elements[2] = new chemicalElements("Lithium", "Li", 3, 6.941);
        
        //creating a loop that will add elements to the array
        for (int i = 0; i < elements.length; i++) {
            elements[3] = new chemicalElements("Beryllium", "Be", 4, 9.012182);
            elements[4] = new chemicalElements("Boron", "B", 5, 10.811);
            elements[5] = new chemicalElements("Carbon", "C", 6, 12.0107);
            elements[6] = new chemicalElements("Nitrogen", "N", 7, 14.0067);
            elements[7] = new chemicalElements("Oxygen", "O", 8, 15.9994);

        //add these elements to the array

        //print out the array
        System.out.println(elements[i].toString());



        
        
            
        
    }


    }
}
