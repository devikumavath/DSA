import java.util.*;

public class bubbleSort3 {
    public static void main(String[] args) {

        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        // array element input
        System.out.println("enter array element");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        // unsorted array output
        System.out.println("unsorted array is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nsorted array is");
        // bubble sort
        for (int i = 0; i < array.length - 1; i++) {
            // n-1 paras and innerloop compared everytime with n-1-i times and it will
            // decrease no of comparsion
            // and to optimize code if any paras is not having single swapping then end loop

            int flag = 0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    flag = 1;
                }

            }
            if(flag == 0)
            break;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();

    }
}
