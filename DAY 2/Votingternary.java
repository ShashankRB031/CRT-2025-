
import java.util.Scanner;

public class Votingternary {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        String result =(age>= 18? "Major - You can Vote !" : "Minor - Not eligible to vote");
        System.out.println("Status : " + result);
    }
}
