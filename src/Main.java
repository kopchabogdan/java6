import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("TASK 1");
        for (int i=0; i<0; i++) {
            System.out.println(i);
        }

        System.out.println("TASK 2");
        System.out.println("y = cosX / lnX");
        for (float x = 1; x <= 3; x+= 0.2)
            System.out.println("X: " + x + "\tY: " + (Math.cos(x) / Math.log10(x)));

        System.out.println("TASK 3");
        int number = 1;
        int[] numbers = new int[0];
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            number = scan.nextInt();

            if (number == 0)
                break;

            int arrayLength = numbers.length;
            int newNumbers[] = new int[arrayLength + 1];
            for (int i = 0; i < arrayLength; i++)
                newNumbers[i] = numbers[i];
            newNumbers[arrayLength] = number;
            numbers = newNumbers;
        } while(true);
        scan.nextLine();
        System.out.println("Numbers: " + Arrays.toString(numbers));
        int pairCount = 0, unpairCount = 0, unpairSum = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                pairCount++;
                continue;
            }
            unpairCount++;
            unpairSum+=numbers[i];
        }
        System.out.println("Pair numbers count: " + pairCount);
        System.out.println("Unpair numbers: ");
        System.out.println("\tCount: " + unpairCount);
        if (unpairCount > 0)
            System.out.println("\tAvg: " + unpairSum / unpairCount);

        System.out.println("TASK 4");
        System.out.println("Enter a line: ");
        String line = scan.nextLine();
        scan.close();
        int dotCount = 0;
        for (int i = 0; i < line.length(); i++)
            if (line.charAt(i) == '.')
                dotCount++;
        System.out.println("Dots count: " + dotCount);
    }
}