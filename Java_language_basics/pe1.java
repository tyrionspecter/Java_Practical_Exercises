import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0,rem, sum = 0;
        int n = num;
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        for(int i =0 ; i< n; i++ ){
            if(n % 2 == 0) {
                sum = sum + n;
            }
        }
        if(n == rev && sum > 25){
            System.out.println(n+" is palindrome and the sum of even numbers is greater than 25 ");
        }
        else if(n == rev && sum < 25){

            System.out.println(n+" is palindrome and the sum of even numbers is less than 25");
        }
        else if(n != rev){
            System.out.println(n+" is not a palindrome");
        }

    }
}
