package DogSuggestion;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Do you prefer a small dog or large dog?");
        String A = scan.nextLine();
        if (A.equals("small")){
            System.out.println("Are You willing to adopt a high maintenance dog?");
            String B = scan.nextLine();

            
            if (B.equals("yes")){
                System.out.println("pug or Chihuahua");
            }else{
                System.out.println("Indian");

            }

        }else if (A.equals("large")){
            System.out.println("Do you want a guard dog?");
            String B = scan.nextLine();

            if (B.equals("yes")){
                System.out.println("Do you live in a cold climate?");
                String C = scan.nextLine();

                if (C.equals("yes")){
                    System.out.println("Husky");
                }else{
                    System.out.println("Doberman or German shepherd");
                }
    
            }else{
                System.out.println("saint bernard");

            }
        }
        scan.close();
    }
}
