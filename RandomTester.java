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
    
    public void lanzarDado (){
        int randomNumber = random.nextInt(6) + 1;
        System.out.println(randomNumber);
    }
    
    public void getRespuesta (){
        String si = "Si";
        String no = "No";
        String talVez = "Tal vez";
        
        int num = random.nextInt(3);
        if (num == 0){
            System.out.println(si);
        }
        else if (num == 1){
            System.out.println(no);
        }
        else{
            System.out.println(talVez);
        }
    }
}
