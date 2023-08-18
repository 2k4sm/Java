import java.util.Scanner;


//implement count num of factors,hcf, lcm
public class calculator{
    
    public static int Add(int a, int b){
        return a+b;
    }
    
    public static int Sub(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }

    public static int divide(int a, int b){
        return a/b;
    }

    public static int remainder(int a, int b){
        return a%b;
    }

    public static int Pow(int a, int b){
        int val = a;
        for (int i = 1; i < b;i++){
            val = val *a;
        }
        return val;
    }
    public static int root(int a, int b){
        return (int)Math.pow(a,(double)1/b);
    }
    public static int ConvertBase(int a , int base){
        int conv = 0;

        for (;a > 0;a/=base){
            conv += a%base;
        }
        
        return conv;
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter the First Number: ");
        int num1 = scan.nextInt();
        System.out.println();
        System.out.print("Please Enter the Second Number: ");
        int num2 = scan.nextInt();
        System.out.println();

        System.out.println("""
                Supported Operations:

                    + -> Addition
                    - -> Substraction
                    * -> Multiplication
                    / -> Division
                    % -> Remainder
                    ^ -> Power
                    # -> Root
                    _ -> ConvertBase (from 10 to N)
                """);

        System.out.print("Operation: ");
        char operater = scan.next().charAt(0);
        System.out.println();

        System.out.printf("%d %s %d = ",num1,operater,num2);

        if (operater == '+'){
            System.out.println(Add(num1, num2));
        }else if (operater == '-'){
            System.out.println(Sub(num1, num2));
        }else if (operater == '*'){
            System.out.println(multiply(num1, num2));
        }else if (operater == '/'){
            System.out.println(divide(num1, num2));
        }else if (operater == '%'){
            System.out.println(remainder(num1, num2));
        }else if (operater == '^'){
            System.out.println(Pow(num1,num2));
        }else if(operater == '#'){
            System.out.println(root(num1, num2));
        }else if(operater == '_'){
            System.out.println(ConvertBase(num1, num2));
        }
        else{
            System.out.println("Operation Unknown.");
        }
        System.out.println();

        scan.close();
    }
}