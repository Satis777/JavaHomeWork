package com.pb.tereschenko.hw10;


public class NumBox<T extends Number> {
    private T[] array;

    public NumBox(T[] array) {
        this.array = array;
    }

    public double average() {
        double sum = 0.0;
        int count = 0;
        for (T el : array) {
            if(el != null){
                sum += el.doubleValue();
                count ++;
            }else continue;

        }
        return sum / count;
    }

    public int length() {
        int size = 0;
        for (T el : array) {
            if (el != null) {
                size++;
            }
        }
        return size;
    }

    public T get(int index) throws MyException {
        T num = null;
        if(index > array.length-1){
            throw new MyException("Индекс превышает размер массива");
        }else {
            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    continue;
                } else num = array[i];
            }
            return num;
        }

    }

    public double sum() {
        double sum = 0.0;
        for (T el : array) {
            if (el != null)
                sum += el.doubleValue();
        }
        return sum;
    }

    public T max() {
        T max = array[0];
        for (T el : array) {
            if (el != null) {
                if (el.intValue() > max.intValue()) {
                    max = el;
                }
            }
            continue;


        }
        return max;
    }

    public void add(T num) throws MyException {
        int s = 1;
        for (int i = 0; i < array.length; i++) {
            if (s < array.length) {
                if (array[i] == null) {
                    array[i] = num;
                    break;
                } else {
                    s++;
                    continue;
                }
            } else {
                throw new MyException("Массив полон");

            }
        }
    }
}

