package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";

        // create a `counter`
        // while `counter` is less than length of array
        // begin loop


        Person  currentPerson;
        Integer counter = 0;
        while(counter < personArray.length ) {

            currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result +=  stringRepresentation;

            counter++;
        }
        return result;
    }


            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable

            // end loop




    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        Person currentPerson;
        for (int counter = 0; counter < personArray.length; counter++) {
            currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
        }
        return result;
    }


        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for (Person stringRepresentation : personArray) {
            result += stringRepresentation;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
