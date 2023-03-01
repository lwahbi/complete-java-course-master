package com.important.my.notes.string;

public class StringPerformanceApp {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String testString = "";
        for (int i = 0; i <= 100000; i++) {
            testString += i;
        }

//        StringBuilder something = new StringBuilder("");
//        for (int i = 0; i <= 100000; i++) {
//            something.append(i);
//        }
//
//        StringBuffer anything = new StringBuffer("");
//        for (int i = 0; i <= 100000; i++) {
//            anything.append(i);
//        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("It took " + totalTime / 1000000 + "ms");

    }

    public static class StringPerformanceTest {
    /**
     * String :
     *          - immutable : every time it s modifier a new object is created with all detail (ref 1 puis ref2 vers le nouveau text)
     *
     *          used : when you don't concatenate a lot of Strings together in a loop.
     *
     * StringBuilder :
     *          + better performence in concatenation (faster, less memory) than String or StringBuffer
     *          - not thread Safe
     *
     *          used : when you concatenate strings in a loop and threadsafety is not an issue.
     *
     *  StringBuffer :
     *          + Same functions as StringBuilder
     *          + almost as fast a StringBuilder
     *          + Thread Safe (Synchronized function)
     *
     *          user : when you concatanate strings in a loop and threadsafety is important
     */


        public static void main(String[] args) {
            long startTime = System.nanoTime();

    //       String testString = "";
    //        for (int i = 0; i <= 100000; i++) {
    //            testString += i; // 2564ms
    //        }

    //        StringBuilder something = new StringBuilder("");
    //        for (int i = 0; i <= 100000; i++) {
    //            something.append(i); // It took 8ms
    //        }

            StringBuffer anything = new StringBuffer("");
            for (int i = 0; i <= 100000; i++) {
                anything.append(i); //It took 9ms
            }

            long endTime   = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("It took " + totalTime / 1000000 + "ms");

        }
    }
}
