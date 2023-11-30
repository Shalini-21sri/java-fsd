import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("arithmetic calculator");
        while(true){

        


            System.out.println("enter first number");
            double num1 = sc.nextDouble();

            System.out.println("enter second number");
            double num2 = sc.nextDouble();

        
            System.out.println("please enter your choice");
            System.out.println("select 1 for add");
            System.out.println("select 2 for subtraction");
            System.out.println("select 3 for multiplication");
            System.out.println("select 4 for divide");
            System.out.println("select 5 for exit");

            int choice = sc.nextInt();
            double result;

            if(choice==1){
                result = num1 + num2;
                System.out.println("addition is" + result);

            }else if (choice ==2){
                result = num1-num2;
                System.out.println("subtraction is " + result);

            }else if(choice ==3){
                result = num1*num2;
                System.out.println("multiplication is " +result);


            }else if (choice == 4){
                if(num2!=0){
                    result = num1/num2;
                    System.out.println("substraction is "+ result);
               
                }else{
                    System.out.println("this number can not divide by zero(0) ");
                }
            }else if(choice==5) {
                System.out.println("program closed");
                break;
                
            }
        }    
            
        
    

    
        
    }
    
    
}
