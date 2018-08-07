package practice2;

public class StringUtils {

    public static String joinStringsWithoutFirstSymbols(String s1, String s2) {
        return s1.substring(1) + s2.substring(1);
    }

    public static String oddLengthStringToThreeLength(String s) {
        int indexOfTheStringMiddle = s.length() / 2;
        int from = indexOfTheStringMiddle - 1;
        int to = indexOfTheStringMiddle + 2;
        return s.substring(from, to);
    }

    public static String moveTwoLastSymbols(String s) {
        int twoLastSymbolsFromIndex = s.length() - 2;
        String twoLastSymbols = s.substring(twoLastSymbolsFromIndex);
        String stringBeginning = s.substring(0, twoLastSymbolsFromIndex);
        return twoLastSymbols + stringBeginning;
    }

    public static String doubleEachCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c).append(c);
        }
        return sb.toString();
    }

    // searching for "b*b" substring
    public static int getSubstringOccurrencesNumber(String s) {
        int counter = 0;
        for(int i = 0; i < s.length() - 2;) {
            int substringEndIndex = i + 2;
            if (s.charAt(i) == 'b' && s.charAt(substringEndIndex) == 'b') {
                counter++;
                i += 3;
                continue;
            }
            i++;
        }
        return counter;
    }

    public static String removeStarsWithNearbySymbols(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length();) {
            if (sb.charAt(i) == '*') {
                int firstSymbolIndex = 0;
                int lastSymbolIndex = sb.length() - 1;
                if (i == firstSymbolIndex) {
                    int deleteToIndex = i + 2;
                    sb.delete(i, deleteToIndex);
                    continue;
                } else if (i == lastSymbolIndex) {
                    int deleteFromIndex = i - 1;
                    int deleteToIndex = sb.length();
                    sb.delete(deleteFromIndex, deleteToIndex);
                    break;
                } else {
                    int deleteFromIndex = i - 1;
                    int deleteToIndex = i + 2;
                    sb.delete(deleteFromIndex, deleteToIndex);
                    i--;
                    continue;
                }
            }
            i++;
        }
        return sb.toString();
    }

    public static int wordsEndingWithSymbolsCounter(String s, char c1, char c2) {
        int counter = 0;
        String[] words = s.split(" ");
        String s1 = String.valueOf(c1);
        String s2 = String.valueOf(c2);
        for (String word : words) {
            String wordLastSymbolString = word.substring(word.length() - 1);
            if (wordLastSymbolString.equalsIgnoreCase(s1) || wordLastSymbolString.equalsIgnoreCase(s2)) {
                counter++;
            }
        }
        return counter;
    }

    public static String removeAllSecondStringOccurrences(String s1, String s2) {
        return s1.replaceAll(s2, "");
    }
}
