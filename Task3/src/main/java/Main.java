import org.example.Solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.solution(number));
    }
}
