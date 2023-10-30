import java.util.*;

public class QUESTIONS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int dig = 0;
        while (n != 0) {
            n = n / 10;
            dig++;
        }
        System.out.print("Digit Count : ");
        System.out.println(dig);
    }
}
