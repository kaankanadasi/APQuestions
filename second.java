public class WordScrambler {
    private String[] scrambledWords;

    /*
     * @param wordArr - an array of String objects
     *      Precondition: wordArr.length is even
    */
    public WordScrambler(String[] wordArr) {
        scrambledWords = mixedWords(wordArr);
    }

    /*
     * @param word1 - a String of characters
     * @param word2 - a String of characters
     * @return a String that contains the first half of word1 and the second half of word2
    */
    private String recombine(String word1, String word2) {
        int half1 = word1.length/2;
        String substring1 = word1.substring(0, half1);

        int half2 = word2.length/2;
        String substring2 = word2.substring(half2);
        
        String concat = substring1 + substring2;
        return concat;
    }

    /*
     * @param words an array of String objects 
     *      Precondition: words.length is even
     * @return an array of String objects created by recombining pairs of strings in array words 
     *      Postcondition: the length of the returned array is words.length
    */
    private String[] mixedWords(String[] words) {
        for(int i = 0; i < mixedWords.length; i+2) {
            words[i] = recombine(words[i], words[i+1]);
            wors[i+1] = recombine(words[i+1], words[i]);
        }
        return words[];
    }
}