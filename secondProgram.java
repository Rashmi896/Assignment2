

public class secondProgram{
    public static void main(String[] args) {
        //determine which of the three numbers is the smallest number, and displays that number using if-else statement.
        int firstnumber=5,secondnumber = 10 , thirdnumber=15;
        if(firstnumber<secondnumber &&firstnumber<thirdnumber)
        System.out.println( firstnumber + " is the smallest number");
        else if (secondnumber<firstnumber&&secondnumber<thirdnumber)
        System.out.println( secondnumber + " is the smallest number");
        else 
        System.out.println( thirdnumber + " is the smallest number");

    }
}
