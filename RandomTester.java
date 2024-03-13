import java.util.Random;
/**
 * Write a description of class RandomTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random random;

    public RandomTester() {
        random = new Random();
    }

    public void printOneRandom() {
        int randomNumber = random.nextInt();
        System.out.println(randomNumber);
    }

    public void printMultiRandom(int count) {
        int num = 1;
        while (num <= count) {
            int randomNumber = random.nextInt();
            System.out.println(randomNumber);
            num++;
        }
    }
}
