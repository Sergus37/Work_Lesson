package by.it;


public class ArrayWorker {

    // счетчик действий!
    public int count = 0;

    public int getMax(int[] array) {
        count++;

        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (max < array[i])
                max = array[i];
        return max;
    }

    public int[] createArray(int size) {
        count++;
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        return a;
    }

    public void printArray(int a[]) {
        count++;
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
