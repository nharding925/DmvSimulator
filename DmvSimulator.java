import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("Welcome to the DMV!");
        
        //print random number 1-200
        int userNumber = random.nextInt(200) + 1;
        System.out.println("Your number is: " + userNumber);
        
        int current = userNumber + 1;
        if (current > 200) current = 1;
        
        //print all the numbers that arent users
        while (current != userNumber) {
            System.out.println("Now serving: " + current);
            current++;
            if (current > 200) current = 1;
        }
        
        int miracle = random.nextInt(100) + 1;
        if (miracle == 1) {
            System.out.println("You have all of the required paperwork and you are all set!");
        } else {
            System.out.println("Sorry, you don't have the required paperwork.");
        }
    }
}