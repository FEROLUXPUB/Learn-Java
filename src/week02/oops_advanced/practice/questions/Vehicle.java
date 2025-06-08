package week02.oops_advanced.practice.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Create final constant MAX_SPEED = 120 in Vehicle class.
 * Try modifying it (observe compilation error)
 */

public class Vehicle {

    public void test() {
        List<Integer> intType = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intType.add(i);
        }
        System.out.println(intType);
        List<String> stringType = intType.stream().map(Object::toString).toList();
    }
}
