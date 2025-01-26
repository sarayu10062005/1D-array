import java.util.Scanner;

public class InArr {
    public static void main(String[] args) {
        try (Scanner get = new Scanner(System.in)) {
            int n = 3;
            String[] arr = new String[n];
            for (int i = 0; i < 3; i++) {
                System.out.printf("Enter Araay element no.%d: ", i+1);
                arr[i] = get.nextLine();
            }
            System.out.println("\nThe given Array elements are: ");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
