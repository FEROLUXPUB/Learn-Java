package week02.oops_advanced.practice.solutions.stringprocessor;

public class StringReverse {

    public static String reverse(String str) {
        StringProcessor rev = str1 -> {
            StringBuilder stringBuilder = new StringBuilder(str1);
            return stringBuilder.reverse().toString();
        };
        return rev.process(str);
    }
}
