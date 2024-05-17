import java.util.Random;
import java.util.Scanner;
class GuessTheNumber{
    private int N;
    public int userNum;
    public  int noOfGuesses=100;
    public void computerInput(){
        Random rand = new Random();
        this.N = rand.nextInt(100);
    }
    public  void  printComputerInput(){
        System.out.println("computer input "+ N);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Guess :");
        this.userNum = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        if (this.N==this.userNum){
            return true;
        } else if (this.N>this.userNum) {
            System.out.println("Guess Higher !! ");
        }
        else {
            System.out.println("Guess Lower !! ");
        }
        return false;
    }
    public void setNoOfGuesses(int num){
        this.noOfGuesses=num;
    }
    public  int getN(){
        return this.N;
    }
}
public class exercise {
    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        game.computerInput();
        while (game.noOfGuesses > 0) {
            game.takeUserInput();
            if (game.isCorrectNumber()) {
                System.out.println("You Won !!");
                return;
            }
            game.setNoOfGuesses(game.noOfGuesses - 1);
        }
        if (game.noOfGuesses > 0) {
            System.out.println("Thank you for playing !! :)");
        } else {
            game.printComputerInput();
            System.out.println("Sorry Hope you try again :<");
        }
    }
}
