package Class2;

public class TestFile2 {
    public static void main (String[] args){
        /**
         Store below scenario value in an appropriate dataType variable, and print the same in console.
         1. number of hours in a day (byte)
         2. max no. of days in an year
         3. total number of employees in an organization
         4. population in a country
         5. interest rate
         6. balance in a bank account
         7. does the sun rise from the west? Store answer
         8. initials of your name (^Use: char) Hello World ---- HW  --- need 2 char variable
         9. Your full name
         */

        byte noOfHours = 24;
        System.out.println("1. There are " + noOfHours + " hours in a day."); //1


        short maxDays = 366;
        System.out.println("2. The total no of days in a Leap Year = " + maxDays + " Days"); //2

        int numEmployee = 87654321;
        System.out.println("3. The total no of employees in Macy's = " + numEmployee); //3

        long populationUs = 3286999777766689383L;
        System.out.println("4. The population of US = " + populationUs);

        float interestRate = 9.99f;
        System.out.println("5. The interest rate of my new car = " + interestRate);

        int balanceAccount = 1000000;
        System.out.println("6. The last balance of my bank account is " + balanceAccount);

        boolean sunRise = true;
        System.out.println("7. Does the sun rise from the west? " + "Answer: " + sunRise );

        char nameFirstInit = 'S';
        char nameLastInit = 'J';
        System.out.println("8. The initials of my name is "+ nameFirstInit+nameLastInit);

        String fullName = "SYEDA JAHAN";
        System.out.println("9. My full name is " + fullName);




    }

}
