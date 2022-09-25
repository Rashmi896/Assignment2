public class fifthProgram{
    public static void main(String[] args) {
        System.out.print("n n^2 n^3 n^4");// According to format
        int n=5; // prints the table for 5 numbers
        for(int i=0;i<=n;i++)
        {
           System.out.println(" "); // prints in new line
            System.out.print(Math.pow(i,1)+" "); // prints number raised to power 1
            System.out.print(Math.pow(i,2)+" ");// prints number raised to power 2
            System.out.print(Math.pow(i,3)+" ");// prints number raised to power 3
            System.out.print(Math.pow(i,4)+" ");// prints number raised to power 4


        }
    }
}
