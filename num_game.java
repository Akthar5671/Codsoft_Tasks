import java.util.Random;

public class codsoft1{
    public static void main(String []arguments){
        int number;
        Random random=new Random();
        number= random.nextInt(101);
        System.out.println("Generated number is:"+ number);

    }
}