package main.java.com.designpatterns.iterator;

import java.util.Iterator;

public class Numbers {

    private String[] numbersArray;

    public Numbers(String[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    public Iterator getIterator() {
        return new OnlyNumbersIterator();
    }

    private class OnlyNumbersIterator implements Iterator {

        private int index = 0;
        private int counter = 0;

        @Override
        public boolean hasNext() {
            if (index < numbersArray.length) {
                int index2 = index;
                while (index2 < numbersArray.length) {
                    String num = numbersArray[index2];
                    try {
                        Integer.parseInt(num);
                        counter = index2 - index;
                        return true;
                    } catch (NumberFormatException e) {
                    }
                    index2 += 1;
                }
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                index = index + counter + 1;
                return numbersArray[index - 1];
            }
            return null;
        }
    }
}