import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int randomNumer = (int) (Math.random() * 100) + 1;
        System.out.println("random");
        System.out.println("Please guess");
        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);

        boolean hasWon = false;
        for (int i = 10; i > 0 ; i--) {
            System.out.println("You have" + i);
            int guess = scanner.nextInt();
            if (randomNumer < guess){
                System.out.println("It't smaller than" + guess +"guess");
            }
            else if (randomNumer > guess){
                System.out.println("It't larger than" + guess +"guess");
            }
            else{
                hasWon = true;
                break;
            }
//            System.out.println("Your guess was:" + guess);
        }
        if (hasWon) {
            System.out.println("correct!");
        }else {
            System.out.println("game over");
        }
    }
}
