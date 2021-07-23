package org.example;

public class Solution {
    public int solution(int A){
        String output = "";
        if (A >= 0 && A <= 100000000)
        {
            String input = Integer.toString(A);
            char [] numchars = input.toCharArray();

            for (int i = 0; i < numchars.length; i++)
            {
                if (i % 2 == 0)
                {
                    output += numchars[i/2];
                }
                else
                {
                    output += numchars[numchars.length - (i/2+1)];
                }
            }

        }
        return Integer.parseInt(output);
    }
}
