public class fourthProgram {
  
    public static void main(String[] args) {
      //When will population first exceed 150000?
        
        int currentPopulation=80000;
        int NumberOfYears=0;
        while(currentPopulation<150000)
        {
            NumberOfYears++;
            currentPopulation= currentPopulation+(1/20)*currentPopulation;
           

        }
        System.out.println(" Number Of Years is" + NumberOfYears);
       

    }
    
}
