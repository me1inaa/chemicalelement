package edu.guilford;

import java.util.Random;
public class Elements 
{
    public static void main( String[] args )
    {
        //instantiating a chemicalElements object using the constructor 
        chemicalElements hydrogen = new chemicalElements("Hydrogen", "H",
                 1, 1.00794);
        //print out this element
        System.out.println("Here is your element using the constructor: " + hydrogen);

        //instantiating a chemicalElements object with random values
        chemicalElements randomElement = chemicalElements.randomElement();
        //print out the random element
        System.out.println("Here is your random element using the constructor: " + randomElement);


        //printing out the toString method of the hydrogen object
        System.out.println(hydrogen.toString());

        //instantiate an array to store the elements 
        chemicalElements[] elements = new chemicalElements[6];
        //adding the first element to the array
        elements[0] = new chemicalElements("Hydrogen", "H", 1, 1.00794);
        //creating a loop that will add elements to the array
        for (int i = 0; i < elements.length; i++) { 
            //instantiate a new random object
            Random rand = new Random();
            //pull a random element from allElements
            elements[i] = chemicalElements.randomElement();
            //print out the array
            System.out.println(elements[i]);
        }
    
        //print out the analysis of the addition of the atomic weights
        System.out.println("The sum of the atomic weights is: " + chemicalElements.sumAtomicWeights(elements));

        

   



        
        
            
        
    }


    }

