import java.util.Scanner;

public class AddNumber {

    public static void main(String[] args) {
        System.out.println("enter the size of the number array");
        Scanner sc = new Scanner(System.in);
        int arr = sc.nextInt();
        int sum =0;
        int num;
        System.out.println("enter "+arr+" numbers to be added");
        for(int i =0; i<arr; i++){
            num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("sum is "+sum);
    }
}
