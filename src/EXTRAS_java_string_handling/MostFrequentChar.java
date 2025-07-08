package EXTRAS_java_string_handling;

public class MostFrequentChar {
    public static void main(String[] args) {
        String input = "success";
        int[] freq = new int[256];
        int maxFreq = 0;
        char mostFreqChar = ' ';

        for (char ch : input.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFreqChar = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFreqChar + "'");
    }
}

