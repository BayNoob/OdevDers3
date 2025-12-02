import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[50];
        System.out.println("\n --Sıralanmamış Sayılar--");
        for (int i = 0; i < 50; i++) {
            numbers[i] = random.nextInt(1, 1000);
            System.out.println(numbers[i]);
        }
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("\n --Sıralanmış Sayılar--");
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
