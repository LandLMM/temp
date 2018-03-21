package main.java.com.designpatterns.iterator;

import java.util.Iterator;

public class TestIterator {

    public static void main(String[] args) {
        Numbers numbers = new Numbers(new String[]{"3", "mam", "43", "gff", "43"});
        Iterator iterator = numbers.getIterator();
        while (iterator.hasNext()) {

            String num = (String) iterator.next();
            System.out.println(num);

        }
    }
}
