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
        
        System.out.println("Now serving: " + userNumber);
    // meaner final message for a more realistic simulation (with evil laugh)
    System.out.println("Nope — you clearly couldn’t be bothered to bring the required paperwork. Come back when you can follow simple instructions. Mwahaha!");
    }
}