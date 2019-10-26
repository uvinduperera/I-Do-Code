import java.util.Scanner;

class Calculator{
  public static void main(String args[]){
    int operator,num1,num2;
    System.out.printf("++++++++++++++++++++++++++++++++++");
    System.out.printf("++++++++++++Calculator++++++++++++");
    System.out.printf("++++++++++++++++++++++++++++++++++");
    Scanner inputs = new Scanner(System.in);
    System.out.println("Enter Number : ");
    num1 = input.next();
    System.out.println("Enter Operator [+|-|*|/]: ");
    operator = input.next();
    System.out.println("Enter Number : ");
    num2 = input.next();
    
    System.out.printf("++++++++++++++++++++++++++++++++++");
    
    switch(operator){
      case "+":Add_Num();break;
      case "-":Reducing_Num();break;
      case "*":Multiply_Num();break;
      case "/":Divide_Num();break;
    }
    
    System.out.printf("++++++++++++++++++++++++++++++++++");
  }
  //Add
  public void Add_Num(){
    System.out.printf("Total is : "+(num1+num2));
  }
  //Reducing_Num
  public void Reducing_Num(){
    System.out.printf("Total is : "+(num1-num2));
  }
  //Multiply_Num
  public void Multiply_Num(){
    System.out.printf("Total is : "+(num1*num2));
  }
  //Divide_Num
  public void Divide_Num(){
    System.out.printf("Total is : "+(num1/num2));
  }
}
