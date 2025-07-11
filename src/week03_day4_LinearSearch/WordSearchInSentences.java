package week03_day4_LinearSearch;

public class WordSearchInSentences {
    public static String searchWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {"Java is great", "I love coding", "This is linear search"};
        String word = "love";
        System.out.println("Sentence: " + searchWord(sentences, word));
    }
}
