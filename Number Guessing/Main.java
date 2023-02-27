import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main{
    Scanner sc=new Scanner(System.in);
    static int Number=0;
      static int min=0;
      static int max=100;
    public static void main(String [] args) {
        // System.out.println("Enter your Guess Number");
        System.out.println("Welcome to the game *Guessing Numbers* !!!! In this game there are 3 rounds");
        System.out.println("In each round u have 10 attempts #You should guess number between 1 to 100");
        System.out.println("For each correct guess you will get one Plus in score and at begining of each level score will be vanished");
        System.out.println("in round 1 you should score above 3");
        System.out.println("in round 2 you should score above 5");
        System.out.println("in round 3 you should score above 7");


        Main obj=new Main();
        obj.level1(Number=RandomNumber(max,min));
        
    }
    static int  RandomNumber(int max,int min){
         return ThreadLocalRandom
            .current()
            .nextInt(min, max + 1);
    }
    public void level1(int number){
        System.out.println("####-----WELCOME TO ROUND1----#####");
        System.out.println("_____ALL THE BEST______");
        System.out.println("Eneter your guess");
        int attempts=10;
        int lvl1score=0;
        for(int i=0;i<attempts;i++){
            int guess=sc.nextInt();
            if(guess==number){
                lvl1score+=1;
            }
            else{
                if(guess<number){
                    System.out.println("You Entered Lower number");
                }
                if(guess>number){
                    System.out.println("You Entered Higher number");
                }
            }
        }
        if(lvl1score>=3){
            System.out.println("Congratulations you won Round1");
            System.out.println("Your Score in Round 1" + lvl1score);
            System.out.println("Play round 2");
            level2(Number=RandomNumber(max,min));
        }
        else{
            System.out.println("Sorry You lose ");
            System.out.println("Your Round 1 score"+ lvl1score);
        }
    }
    public void level2(int number){
        System.out.println("####-----WELCOME TO ROUND2----#####");
        System.out.println("Eneter your guess");

        int attempts=10;
        int lvl2score=0;
        for(int i=0;i<attempts;i++){
            int guess=sc.nextInt();
            if(guess==number){
                lvl2score+=1;
            }
            else{
                if(guess<number){
                    System.out.println("You Entered Lower number");
                }
                if(guess>number){
                    System.out.println("You Entered Higher number");
                }
            }
        }
        if(lvl2score>=5){
            System.out.println("Congratulations you won Round2");
            System.out.println("_____ALL THE BEST______");

            System.out.println("Your Score in Round 2" + lvl2score);
            System.out.println("Play round 3");
            level3(Number=RandomNumber(min,max));
        }
        else{
            System.out.println("Sorry You lose ");
            System.out.println("Your Round 2 score"+ lvl2score);
        }
    }
    public void level3(int number){
        System.out.println("####-----WELCOME TO ROUND3----#####");
        System.out.println("_____ALL THE BEST______");
        System.out.println("Eneter your guess");


        int attempts=10;
        int lvl3score=0;
        for(int i=0;i<attempts;i++){
            int guess=sc.nextInt();
            if(guess==number){
                lvl3score+=1;
            }
            else{
                if(guess<number){
                    System.out.println("You Entered Lower number");
                }
                if(guess>number){
                    System.out.println("You Entered Higher number");
                }
            }
        }
        if(lvl3score>=7){
            System.out.println("Congratulations you won Round3");
            System.out.println("Your Score in Round 3" + lvl3score);
            System.out.println("CONGRATS YOU WON THE GAME");
        }
        else{
            System.out.println("Sorry You lose at round 3 ");
            System.out.println("Your Round 3 score"+ lvl3score);
        }
    }
}

