import java.util.Scanner;

//Create Class Structure
//Declare Inputs
//Build the User Input method
//Declare output value where output value is stored
//Build Switch Statement for determing the output value based on num1, num2, and operator combination
//Display the output


class Main {

  
  
  public static void main(String[] args) {

    System.out.println("---------------------------------- \n" + "Welcome to  Elzie's Logic Based (Basic) Calculator \n"
				+ "----------------------------------");
		System.out.println("The basic calculator is strictly logic, meaning it has no UI and only supports basic mathematical fuctions: \n" + "\n" + "1. Addition (+) \n" + "2. Subtraction (-) \n"
				+ "3. Multiplication (* OR x) \n" + "4. Division (/) \n");

    //Variables
    //doubles for numbers with deciaml points
    double num1, num2, answer;

    char operator;

    //Scanner Input Initialization
    Scanner UserInput = new Scanner(System.in);

    //LOGIC
    System.out.println("First Number: ");
    num1 = UserInput.nextDouble();

    System.out.println("Second Number: ");
    num2 = UserInput.nextDouble();

    System.out.println("Operator: ");
    operator = UserInput.next().charAt(0);

    //Switch statements for inputs
    switch (operator) {

      case '+' :
      answer = num1 + num2;
      System.out.println(num1 + " + " + num2 + " = " + answer);
      break;

      case '-' :
      answer = num1 - num2;
      System.out.println(num1 + " - " + num2 + " = " + answer);
      break;

      case '*' :
      answer = num1 * num2;
      System.out.println(num1 + " * " + num2 + " = " + answer);
      break;

      case '/' :
      answer = num1 / num2;
      System.out.println(num1 + " / " + num2 + " = " + answer);
      break;

      default:
      System.out.println("Please enter a supported Operator - '+, -, *, or /'." + "\n");
      break;
      
    }

    UserInput.close();
  
  }


}