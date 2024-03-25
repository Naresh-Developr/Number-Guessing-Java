import java.util.Scanner;
import java.util.Random;

public class Number {

    private static int MAX_ATTEMPT = 10;
    private static int MAX_RANGE = 100;
    private static int MIN_RANGE = 1;
    private static int MAX_ROUNDS = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int total_score = 0;

        System.out.println("Number Gussing Game :) ");
        System.out.println("Total Number of Attempts to guess the number was 10 ");
        System.out.println("The Game should of three rounds");

        for(int i=0;i<MAX_ROUNDS;i++){
            int number = random.nextInt(MIN_RANGE,MAX_RANGE);
            int attempt = 0;

            System.out.println("The number you are going to choose, it should  be in the range of 1 to 100");

            while(attempt<MAX_ATTEMPT){
                System.out.println("Enter your Guss: ");
                int guss = sc.nextInt();
                attempt = attempt+1;

                if(guss == number){
                    int score = MAX_ATTEMPT-attempt;
                    total_score = total_score+score;
                    System.out.printf("Sucessfully gussed the Number. Attempt = %d , round_Score = %d ",attempt,score);
                    break;
                }
                else if(guss < number){
                    System.out.printf("Wrong guess.Attempt = %d,\n", MAX_ATTEMPT-attempt);
                    System.out.println("The actuall number was greater than the guessed number");
                
            }else if(guss > number){
                System.out.printf("Wrong guess.Attempt = %d,", MAX_ATTEMPT-attempt);
                System.out.println("The actuall number was lesser than the guessed number");    
        }   

        }
        if(attempt == MAX_ATTEMPT){
            System.out.printf("\nRound = %d",i);
            System.out.println("Attempt = 0");
            System.out.printf("The Random Number is %d\n\n",number);
        }
    }
    System.out.printf("Game over !! Total score = %d\n\n",total_score);
    sc.close();

    
}
}
