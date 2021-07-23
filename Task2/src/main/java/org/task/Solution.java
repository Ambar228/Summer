package org.task;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public int solution(String s) {
        String [] sentences = s.split("\\s*(\\?|!|\\.)\\s*");
        return findMaxWords(sentences);
    }

    private int findMaxWords(String[] sentences) {
        int index = 0;
        int maxCountWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            String [] words = sentences[i].split("\\s+");
            if (maxCountWords < words.length) {
                index = i;
                maxCountWords = words.length;
            }
        }
        System.out.println("Longest sentence - " + sentences[index]);
        return maxCountWords;
    }
}
