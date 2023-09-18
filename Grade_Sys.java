import java.util.Scanner;
class grade
{
    Scanner sc = new Scanner(System.in);
    int total1,total2,total3,total4,total5,mtotal;
    double per,mper;
void design()//design function
{

        System.out.print("\n-----------------------------------------------------------------------------------------------");
     System.out.print("\n\t***************************************************************************************");
    System.out.print("\n\t************                                                   ************************");
    System.out.print("\n\t************            Student Grade Calculator (CLI)         ************************");
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
System.out.println("");


}
    void java()//java function
    {
        int marks1,marks2,marks3;
        grade g=new grade();
          System.out.println("");
        System.out.println("Enter Java subject Marks");
        System.out.println("Enter Student Marks For Assignment OUT OF 30");
        marks1 = sc.nextInt();
        if (marks1>30){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.java();
        }

        System.out.println("Enter Student Marks For Quiz OUT OF 20");
        marks2 = sc.nextInt();
        if (marks2>20){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.java();
        }

        System.out.println("Enter Student Marks For Exams OUT OF 50");
        marks3 = sc.nextInt();
        if (marks3>50){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.java();
        }
        total1 = marks1+marks2+marks3;
        System.out.println("Your Java Subject Marks is "+total1);

    }
    void C()//C function
    {
        int marks1,marks2,marks3;
        grade g=new grade();
        System.out.println("");
        System.out.println("Enter C subject Marks");
        System.out.println("Enter Student Marks For Assignment OUT OF 30");
        marks1 = sc.nextInt();
        if (marks1>30){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.C();
        }

        System.out.println("Enter Student Marks For Quiz OUT OF 20");
        marks2 = sc.nextInt();
        if (marks2>20){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.C();
        }

        System.out.println("Enter Student Marks For Exams OUT OF 50");
        marks3 = sc.nextInt();
        if (marks3>50){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.C();
        }
        total2 = marks1+marks2+marks3;
        System.out.println("Your C Subject Marks is "+total2);
    }
    void Python()//Python function
    {
        int marks1,marks2,marks3;
        grade g=new grade();
        System.out.println("");
        System.out.println("Enter Python subject Marks");
        System.out.println("Enter Student Marks For Assignment OUT OF 30");
        marks1 = sc.nextInt();
        if (marks1>30){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.Python();
        }

        System.out.println("Enter Student Marks For Quiz OUT OF 20");
        marks2 = sc.nextInt();
        if (marks2>20){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.Python();
        }
        System.out.println("Enter Student Marks For Exams OUT OF 50");
        marks3 = sc.nextInt();
        if (marks3>50){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.Python();
        }
        total3 = marks1+marks2+marks3;
        System.out.println("Your Python Subject Marks is "+total3);
    }
    void SQl()//SQL function
    {
        int marks1,marks2,marks3;
        grade g=new grade();
        System.out.println("");
        System.out.println("Enter SQl subject Marks");
        System.out.println("Enter Student Marks For Assignment OUT OF 30");
        marks1 = sc.nextInt();
        if (marks1>30){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.SQl();
        }

        System.out.println("Enter Student Marks For Quiz OUT OF 20");
        marks2 = sc.nextInt();
        if (marks2>20){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.SQl();
        }

        System.out.println("Enter Student Marks For Exams OUT OF 50");
        marks3 = sc.nextInt();
        if (marks3>50){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.SQl();
        }
        total4 = marks1+marks2+marks3;
        System.out.println("Your SQl Subject Marks is "+total4);
    }
    void JavaScript()//Javascript function
    {
        int marks1,marks2,marks3;
        grade g=new grade();
        System.out.println("");
        System.out.println("Enter JavaScript subject Marks");
        System.out.println("Enter Student Marks For Assignment OUT OF 30");
        marks1 = sc.nextInt();
        if (marks1>30){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.JavaScript();

        }

        System.out.println("Enter Student Marks For Quiz OUT OF 20");
        marks2 = sc.nextInt();
        if (marks2>20){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.JavaScript();
        }

        System.out.println("Enter Student Marks For Exams OUT OF 50");
        marks3 = sc.nextInt();
        if (marks3>50){
            System.out.println("Invalid input enter again");
            System.out.println("");
            g.JavaScript();
        }
        total5 = marks1+marks2+marks3;
        System.out.println("Your JavaScript Subject Marks is "+total5);
    }

    void Total()//Total function
    {
        mtotal=total1+total2+total3+total4+total5;
        System.out.println("");
        System.out.println("Overall subjects total is "+mtotal+" Out of 500");
    }
    void Percentage()//Percentage function
    {
        per=mtotal/5;
        System.out.println("");
        System.out.println("Percentage is "+per);
        System.out.println("");
    }
    void Grade()//Grade function
    {

        if (per>=80 )
        {
            System.out.println("Excellent!You Passed with A Grade");
            return;
        }
        if (per>=65)
        {
            System.out.println("Great!You Passed with B Grade");
            return;
        }

        if (per>=50)
        {
            System.out.println("Good!You Passed with C Grade");
            return;
        }

        else  if (per>=35) {
            System.out.println("Nice!You Passed with D Grade ");
            return;
        }
        else if (per<35)
        {
            System.out.println("You are just Failed Your Grade is F") ;
            return;
        }
    }

 public static void main (String args[])//main function
 {
    grade obj = new grade();
    // System.out.println("Enter your subjects marks");
    obj.design();//calling function
     obj.java();
     obj.C();
     obj.Python();
     obj.SQl();
     obj.JavaScript();
     obj.Total();
     obj.Percentage();
     obj.Grade();

}}