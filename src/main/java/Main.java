//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2


import java.util.Random;
public class Main {

    public static void main(String[] args){

        Random random = new Random();
        int i = new Random().nextInt(2000);
        System.out.println(i);
        int n = bit(i);
        System.out.println(n);
        int[] m1 = getMultiples(n,i);
        int[] m2 = getNonMultiples(n,i);


    }

    static int bit(int x){
        int t = 0;
        while(x > 1) {
            x >>= 1;
            t++;
        }
        return t;
    }

    static int[] getMultiples(int n, int i){
        int size = getArraySize(n, i);
        int[] m1 = new int[size];
        int k = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j%n == 0) {
                m1[k] = j;
                k++;
            }
        }
        return m1;
    }

    static int[] getNonMultiples(int n, int i){
        int size = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j%n != 0) size++;
        }
        int[] m2 = new int[size];
        int k = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j%n != 0) {
                m2[k] = j;
                k++;
            }
        }
        return m2;
    }

    static int getArraySize(int n, int i){
        int size = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j%n == 0) size++;
        }
        return size;
    }

}
