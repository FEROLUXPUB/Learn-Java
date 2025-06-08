package week02.oops_advanced.practice.solutions.stringprocessor;

/**
 * Create @FunctionalInterface StringProcessor with process(String s)
 * Implement it using lambda to reverse a string
 */
@FunctionalInterface
public interface StringProcessor {

    String process(String input);
}
