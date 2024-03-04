import java.util.Scanner;

public class ControlFlow {
            public static void main(String[] args) {
                try{
                    Scanner input = new Scanner(System.in);
                    System.out.print("Please Input Your Score: ");
                    double score = input.nextDouble();
                    if(score >=90){
                        System.out.println("Grade A");
                    }
                    else if(score >=80){
                        System.out.println("Grade B");
                    }
                    else if(score >=70){
                        System.out.println("Grade C");
                    }
                    else if (score >=60) {
                        System.out.println("Grade D");
                    } else if (score>=50) {
                        System.out.println("Grade E");
                    }
                    else {
                        System.out.println("Grade F");
                    }
                }catch (Exception e){
                    System.out.println("You can not type text");
                }

            }
}

