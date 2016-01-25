package com.github.sevntu.checkstyle.checks.coding;

import java.util.HashMap;

public class InputMapIterationInForEachLoopExtends {

    public static class TestMap extends HashMap<Integer, Integer> {
        public void test() {
            for (Entry<Integer, Integer> entry : this.entrySet()) {
            }

            for (Entry<Integer, Integer> entry : entrySet()) {
            }
        }
    }
}
