package org.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter text");
        String s = new Scanner(System.in).nextLine();
        Solution solution = new Solution();
        int countwrds = solution.solution(s);
        System.out.println("The maximum number of words from the text = " + countwrds);
    }
}
