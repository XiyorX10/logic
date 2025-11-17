//--------------------------------------improved version ft. suki---------------------------------------------------------------------









//negation !p
//conjuction p && q
//disjunction `p
//implication `!p
//biconditional p==q


// 1st upgrade idea
//- when ask for negation, only ask for p not both p and q 
//- result displayed in a box
//- only type "t" or "f" for p and q

// 2nd upgrade idea
//- add implication, biconditional
//- input validation for integer(ask for operation part) and input validation for boolean(if input wasnt true or false)
//- 




//improvement
//- naming from " logic2 " to " Logic2 " according to CamelCase
//- Boolean to boolean(primitive)
//- While the next input is NOT a boolean, keep looping use ---- while (!scanner.hasNextBoolean()) 











import java.util.Scanner;

public class logic1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String choice;

        do {

            int logicOperation;
            boolean p = true;   //normalize initializing primitive datatypes (int, double, boolean)
            boolean q = true;
            String yellow = "\u001B[33m";
            String reset = "\u001B[0m";

            System.out.println("\n1. Negation (¬p)");
            System.out.println("2. Conjuction (p n q)");
            System.out.println("3. Disjunction (p v q)");

            //handle wrong inputs here
            while(true){
                System.out.print("Insert your logical operators : ");
                logicOperation = scanner.nextInt();

                if(logicOperation < 1 || logicOperation > 3){   //if not 1 or 3
                    System.out.println(yellow+"\nInvalid logical operators ! "+reset + "\n\n");
                }else{
                    break;
                }
            }

            //input area
            System.out.print("\nEnter p : ");
            p = scanner.nextBoolean();

            if(logicOperation != 1){    //include "NOT" here directly
                System.out.print("\nEnter q : ");
                q = scanner.nextBoolean();
            }

            //--------------------------- compression part ------------------------
            boolean ans = true; //use variables to keep the values

            switch(logicOperation) {    //only apply value in switch
                case 1: 
                    ans = !p;
                    break; 
                case 2: 
                    ans = p && q; 
                    break;
                case 3: 
                    ans = p || q; 
                    break;
            }

            //--------------------------- single output ----------------------------------------
            String spaces = (ans) ? "             " : "            ";   //since "true" is 1 letter shorter than "false", add extra space

            System.out.println("\n=========================================");
            System.out.println("=                                       =");
            System.out.println("=                                       =");
            System.out.println("=            Answer is " + yellow + ans + reset + spaces +"=");
            System.out.println("=                                       =");
            System.out.println("=                                       =");
            System.out.println("=========================================");

            scanner.nextLine();
            System.out.println("\nTry again? : (y/n)");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("y"));
        System.out.println("\nBye");

    scanner.close();

    }
}

