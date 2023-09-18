import java.util.Scanner;//header file or library for basic java functions

class Calci //class keyword with class name
{
    int val1,val2,result,end; // declaring variables with their respective datatype

    Scanner obj = new Scanner(System.in);//Creating scanner class object for taking input from user
    void addition()//addition function
     //user defined function for arithmetic operations
    {
        System.out.println("Please Enter two numbers for addition");//printing function
        val1 = obj.nextInt();//taking input
        val2 = obj.nextInt();

        result = val1 + val2;//initializing the result with the operation

        System.out.println("The addition is " + result);

    }
    void subtraction()//subtraction function
    {
        System.out.println("Please Enter two numbers for subtraction");
        val1 = obj.nextInt();
        val2 = obj.nextInt();

        result = val1 - val2;

        System.out.println("The subtraction is " + result);
    }
    void multiplication()//multiplication function
    {
        System.out.println("Please Enter two numbers for multiplication");
        val1 = obj.nextInt();
        val2 = obj.nextInt();

        result = val1 * val2;

        System.out.println("The multiplication is " + result);
    }
    void division()//division function
    {
        System.out.println("Please Enter two numbers for division");
        val1 = obj.nextInt();
        val2 = obj.nextInt();

       Calci obj5 = new Calci();

        
        if (val1 == 0 || val2 == 0)//Exeption handling for division of 0
        {
            try {
            int result = val1 / val2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number cannot be divided by zero ");
}
         System.out.println("Please try again because 0 cannot be divided");
          obj5.division();
        } 
        else  {
             result = val1 / val2;
              System.out.println("The division is " + result);
        }
    
    }
    void Exit69(){
        Calci c1 = new Calci();//creating object for calling different functions
        System.out.println("Do you wish to continue");
         System.out.println(" ");
        System.out.println("For continue press y or Y");
        System.out.println("For exit press n or N");
        end = obj.next().charAt(0);//taking input with characters

        if (end == 'y' || end == 'Y') {
            c1.main1();
        }else if (end == 'n' || end == 'N') {
               System.out.println(" ");
            System.out.println("Program Exited Succesfully");
            System.exit(0);// I have use exit function to terminate the program
        }
        else{
            System.out.println("Invalid Input Enter again");
             System.out.println(" ");
            c1.Exit69();
        }
    }
    //public static void main(String[] args)
    void main1()// created another user define function(main) for easy accesibility
    {
        Scanner obj = new Scanner(System.in);
        Calci c = new Calci();
        int choice;
        for (int i=1;i<=5;i++) {
            i = 1;
     System.out.print("\n-----------------------------------------------------------------------------------------------");
     System.out.print("\n\t***************************************************************************************");
    System.out.print("\n\t************                                                   ************************");
    System.out.print("\n\t************                 CALCULATOR APPLICATION (CLI)                     ************************");
    System.out.print("\n\t************                                                   ************************");
    System.out.print("\n\t***************************************************************************************\n");
    System.out.print("\n------------------------------------------------------------------------------------------------\n\n");

 System.out.print ("    \n\t\t    ***********************************************");
     System.out.print ("     \n\t\t   **          CODING SAMURAI                   **");
    System.out.print  ("     \n\t\t  ***********************************************");
   System.out.print   ("\n");
System.out.print("\n");
System.out.print("\n");

System.out.print("PROJECT BY : SK Moinuddin Zahiruddin\n");
   System.out.println(" ");

            System.out.println("Please Enter a Choice between 1 to 4 for Artihmetic Operations  ");
            System.out.println("  1 For Addition                                             ");
            System.out.println("  2 For Subtraction                                            ");
            System.out.println("  3 For Multiplication                                         ");
            System.out.println("  4 For Division                                               ");
            System.out.println("  5 For Exit                                                   ");
            choice = obj.nextInt();


            switch (choice) {
                case 1:
               // System.out.println("\u001B[H\u001B[2J");
                   c.addition();//Calling Function
                        

                    break;
                case 2:
                //System.out.println("\u001B[H\u001B[2J");
                    c.subtraction();
                    break;
                case 3:
               // System.out.println("\u001B[H\u001B[2J");
                    c.multiplication();
                    break;
                case 4:
                //  System.out.println("\u001B[H\u001B[2J");
                    c.division();
                    break;
                case 5:
                 // System.out.println("\u001B[H\u001B[2J");
                    c.Exit69();
                    break;

                    default:
                     // System.out.println("\u001B[H\u001B[2J");
                    System.out.println("Enter between 1 to 5 only ");
                    System.out.println(" ");
            
                }
                    }

            }

        public static void main(String[] args)//main function will be executed first
        {
        Calci c2 = new Calci();//making another object for calling user defined function
        c2.main1();//calling function
        }


}