public class Variables {

    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Variables myCode = new Variables();
    }
//    Declaration of Variables for this class

    public String storeName="Papa's Pizzeria";
//    Adding public makes available to entire class(this document)
    public double pancakesPrice=2.99;
    public int partySize; //declare partySize without filling in yet

    public Variables(){
//        this is like the "go method"
        System.out.println("Haro Word");
        partySize=4; //assign value to partySize
        order(10);
    }// Variables()



    public void order(int number){
//       Example of method wide variable
//          Variables doesn't work outside of this order method
        String flavor="blueberry";
    }
}

/* Notes on variables
    have = sign
    parameters - variables used as input in method

    for loops -
        for (int row=0&& col&&...)
            row and col are variables

    floating around like variables for red green or blue

Variable types
    int - whole numbers
    double - decimal
    boulean - true or false
    string - text
*/