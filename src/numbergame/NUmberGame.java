
package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NUmberGame {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
        Random rand = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttemps=5;
        int score=0;
        int attemps=0;
        int targetnumber=0;
        String playAgainin = null;
        boolean playagain = true;
        while(playagain) {
            targetnumber = rand.nextInt(maxRange - minRange+1) + minRange;
            attemps=0;
            System.out.print("WELCOME TO THE NUMBER GUESSING GAME!!!");
            System.out.println("I HAVE SELECTED A NUMBER BETWEEN"+""+minRange+""+"AND"+""+maxRange+""+".CAN YOU GUESS IT PLEASE.");
        while (attemps < maxAttemps ){
            System.out.print("ENTER OUR GUESS:");
            int userguess = sc.nextInt();
            attemps++;
            if(userguess == targetnumber){
                System.out.println("CONGRATULATIONS YOU'VE GUESSED THE RIGHT NUMBER IN"+""+attemps+""+"ATTEMPS!!");
                score += (maxAttemps - attemps)+1;
                break;
            } else if(userguess < targetnumber){
                System.out.println("YOUR GUESS IS TOO LOW. TRY AGAIN.");
             } else{
                System.out.println("YOUR GUESS IS TOO HIGH. TRY AGAIN.");
            }        
        }
        if (attemps == maxAttemps){
            System.out.println("YOU RAN OUT OF THE ATTEMPS.THE CORRECT NUMBER WAS"+" "+targetnumber+""+".");
        }
        System.out.println("YOUR CURRENT SCORE IS: "+score);
        System.out.println("DO YOU WANT TO PLAY AGAIN? (YES/NO)");
          playAgainin = sc.next();
          playagain = playAgainin.equalsIgnoreCase("YES");
    }
    System.out.println("YOUR FINAL SCORE IS:"+score+"IN"+""+attemps+""+"ATTEMPS.");
    }
    
}
