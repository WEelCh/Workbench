import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class InsertionSort {

    public static void main(String[] args) {
        ArrayList<Integer> lines = new ArrayList<Integer>();
        try {
            File    f       = new File   (args[0]); // read file from path
            Scanner fReader = new Scanner(f);
            String  buffer;
            while (fReader.hasNextLine()) {
                // cause last line is just empty
                buffer = fReader.nextLine();
                if (fReader.hasNextLine()) {
                    lines.add(Integer.parseInt(buffer));
                }
            } fReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("A file related error occurred");
            e.printStackTrace();
        }
        Integer[] A = lines.toArray(new Integer[0]);

        long start = System.nanoTime();
        sort(A);
        long end   = System.nanoTime();

        for (int e : A) {
            System.out.println(e);
        } 
        System.out.println(Long.toString(end-start));
    }


    public static void sort(Integer[] A) {
        //System.out.println(Arrays.toString(A));
        int i, k;

        for (int j = 1; j < A.length; j++) {
            k = A[j];
            i = j - 1;
            while ( (i >= 0) && (A[i] > k) ) {
                A[i+1] = A[i];
                i--;
            } A[i+1] = k;
        }
        //System.out.println(Arrays.toString(A));
    }
}