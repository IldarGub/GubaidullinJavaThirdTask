import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int arraySize = scanner.nextInt();
        int[] userArray = new int[arraySize];
        System.out.println("Введите элементы числового массива:");
        for (int i = 0; i < arraySize; i++) {
            userArray[i] = scanner.nextInt();
        }
        for (int j : userArray) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }
}