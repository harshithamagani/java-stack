public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        String trimStr1 = str1.trim();
        String trimStr2 = str2.trim();
        return trimStr1.concat(trimStr2);
    }
    Integer getIndexOrNull(String word, char letter) {
        Integer pos =  word.indexOf(letter);
        return pos > 0 ? pos : null;
    }

    String concatSubstring(String str, int start, int end, String word){
        String substr = str.substring(start, end);
        String result = substr.concat(word);
        return result;
    }
}