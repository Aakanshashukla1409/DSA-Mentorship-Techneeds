import java.util.*;
public class QUESTIONS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lowest Number : ");
        int low = sc.nextInt();
        System.out.print("Enter the Highest Number : ");
        int high = sc.nextInt();

        System.out.println("Prime  Number ->");
        for(int n = low; n <=high; n++){
            int count = 0;

            for(int div = 2; div*div <=n; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }

             if(count ==  0){
                 System.out.println(n);
             }
        }
    }
}
