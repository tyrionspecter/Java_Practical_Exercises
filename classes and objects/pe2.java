import java.util.Scanner;

public class Pe2 {
    public static void main(String[] args) {
        System.out.println("ennter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        if (num == 0) {
            System.out.println("0 is not a valid input");

        }
        while (num != 1) {
            if (num % 4 != 0) {
                System.out.println(n + " is not power of 4 ");
            }
            num = num / 4;
        }
        System.out.println(n + " is power of 4");
    }
}

