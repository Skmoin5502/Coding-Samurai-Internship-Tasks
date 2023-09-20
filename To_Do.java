import java.util.*;//header file or library for basic java functions

 class ToDoList //class keyword with class name
 {
    public static ArrayList<String> tasks = new ArrayList<String>();//declaring arraylist
    public static ArrayList<String> dec = new ArrayList<>();
    public static ArrayList<String> date = new ArrayList<>();
    public static void main(String[] args) {
        ToDoList manager = new ToDoList();
        Scanner in = new Scanner(System.in);//Creating object for Taking Input From User
        int choice;

        //Basic design For CLI Program Downwards
    System.out.print("\n-----------------------------------------------------------------------------------------------\n");
     System.out.print("\n\t***************************************************************************************");
    System.out.print("\n\t************                                                   ************************");
    System.out.print("\n\t************                 TO DO LIST APPLICATION (CLI)      ************************");
    System.out.print("\n\t************                                                   ************************");
    System.out.print("\n\t***************************************************************************************\n");
    System.out.print("\n------------------------------------------------------------------------------------------------\n");

    System.out.print ("    \n\t\t    ***********************************************");
     System.out.print ("     \n\t\t   **            CODING SAMURAI                 **");
    System.out.print  ("     \n\t\t  ***********************************************");
   System.out.print   ("\n");
    System.out.print("\n");
   System.out.print("\n");


System.out.print("PROJECT BY : SK Moinuddin Zahiruddin\n");
System.out.print("\n");
        while (true) {
            System.out.println("1. Add task");//Menu Options for user to access functions
            System.out.println("2. Remove task");
            System.out.println("3. Completed task Or Mark task");
            System.out.println("4. View tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = in.nextInt();

                switch (choice) {
                    case 1:

                        addTask();//calling add function
                           System.out.println("");
                        break;
                    
                        case 2:

                        removeTask();//calling remove function
                           System.out.println("");
                           break;
                    
                           case 3:

                        displayTasks();//calling display function
                        System.out.print("Enter task number to mark as complete: ");
                        int taskIndex = in.nextInt();
                        manager.markTask(taskIndex);
                        break;
                    
                        case 4:

                        viewTasks();//calling view function
                           System.out.println("");
                        break;
                    case 5:
                        exit();//calling exit function
                        break;
                    default:
                       System.out.println("");
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                in.nextLine();
            }
        }
    }

    public static void addTask()//ADDITION OF TASK FUNCTION TO ADD TASK
     {
        Scanner in = new Scanner(System.in);
          System.out.println("");
        System.out.print("Enter task: ");
        tasks.add(in.nextLine());
        System.out.println("Enter description: ");
        dec.add(in.nextLine());
        System.out.println("Enter due date: ");
        date.add(in.nextLine());
          System.out.println("");
          System.out.println("\n***********************\n");
          System.out.println("Task Added Successfully");
          System.out.println("\n***********************\n");
    }

    public static void removeTask()//REMOVE TASK FUNCTION TO REMOVE ANY PARTICULAR TASKS
     {
        Scanner in = new Scanner(System.in);
        int taskNum;

        displayTasks();
          System.out.println("");
        System.out.print("Enter task number to remove: ");
        try {
            taskNum = in.nextInt();
            if (taskNum <= 0 || taskNum > tasks.size()) {
                throw new IndexOutOfBoundsException();
            }
            tasks.remove(taskNum - 1);
            dec.remove(taskNum - 1);
            date.remove(taskNum - 1);
              System.out.println("");
          System.out.println("\n***********************\n");
          System.out.println("Task Removed Successfully");
          System.out.println("\n***********************\n");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            in.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid task number. Please try again.");
        }
        
    }
     private static void markTask(int index) //MARKED TASK TO PUT TASK AS COMPLETED
     {

         if (index >= 1 && index <= tasks.size()) {
             tasks.set(index - 1 , tasks.get(index - 1)+" [Completed]");
               System.out.println("");

               System.out.println("\n***********************\n");
          System.out.println("Task Completed Sucessfully ");
          System.out.println("\n***********************\n");
         } else {
             System.out.println("Invalid task index.");
         }
     }
    public static void displayTasks() {

        if (tasks.isEmpty()) {

              System.out.println("\n***********************\n");
          System.out.println( "  No Tasks to display          ");
          System.out.println("\n***********************\n");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                  //accessing the data through arraylist from add function
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    private static void viewTasks()//TO VIEW THE TASKS
    {
        int view;
        Scanner in = new Scanner(System.in);

        if (tasks.isEmpty()) {
              System.out.println("");

                 System.out.println("\n***********************\n");
          System.out.println( "  No Tasks to display          ");
          System.out.println("\n***********************\n");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                //accessing the data through arraylist from add function
  System.out.println("\n********************************************************************************************\n");
   System.out.println((i + 1) + ". Title = " + tasks.get(i)+", Description = " + dec.get(i)+", Due date = " + date.get(i));
  System.out.println("\n*******************************************************************************************\n");
            }
        }
    }

    public static void exit() {
          System.out.println("");
           System.out.println("\n***********************\n");
          System.out.println("     Exiting Program");
          System.out.println("\n***********************\n");
        System.exit(0);
    }
}