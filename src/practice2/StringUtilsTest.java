package practice2;

public class StringUtilsTest {

    public static void main(String[] args) {
        System.out.println(StringUtils.joinStringsWithoutFirstSymbols("Hello", "World"));
        System.out.println(StringUtils.oddLengthStringToThreeLength("Candy"));
        System.out.println(StringUtils.moveTwoLastSymbols("Hello"));
        System.out.println(StringUtils.doubleEachCharacter("Candy"));
        System.out.println(StringUtils.getSubstringOccurrencesNumber("bob is babobabbub"));
        System.out.println(StringUtils.removeStarsWithNearbySymbols("th*is is sum*mer"));
        System.out.println(StringUtils.wordsEndingWithSymbolsCounter("hello world world hello", 'o', 'D'));
        System.out.println(StringUtils.removeAllSecondStringOccurrences("Abcd abcdcba abcdef jklbce", "bc"));
    }
}
