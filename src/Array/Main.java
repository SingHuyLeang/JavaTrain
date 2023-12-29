package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[50];
        int n=0,op;
        do {
            System.out.print(
                """
                    1. Input
                    2. Output
                    3. Search
                    4. Update
                    5. Remove
                    6. Insert
                    7. Sort
                    8. add
                    9. clear
                    10. exit           \s
                """
            );
            System.out.print("Please choose option : "); op = scan.nextInt();
            switch (op){
                case 1->{
                    System.out.print("Enter size of array[0->50] = "); n = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter element of array["+i+"] = "); array[i] = scan.nextInt();
                    }
                }
                case 2->{
                    for (int i = 0 ; i < n ; i++ ) {
                        System.out.println("Element of array["+i+"] = "+array[i]);
                    }
                }
                case 3->{
                    int val;
                    System.out.print("Enter element for search = "); val = scan.nextInt();
                    for (int i = 0 ; i < n ; i++ ) {
                        if ( val == array[i]){
                            System.out.println("Element of array["+i+"] = "+array[i]);
                        }
                    }
                }
                case 4->{
                    int val;
                    System.out.print("Enter element for update = "); val = scan.nextInt();
                    for (int i = 0 ; i < n ; i++ ) {
                        if ( val == array[i]){
                            System.out.print("Enter new element of array["+i+"] = "); array[i] = scan.nextInt();
                        }
                    }
                }
                case 5->{
                    int val;
                    System.out.print("Enter element for remove = "); val = scan.nextInt();
                    for (int i = 0 ; i < n ; i++ ) {
                        if ( val == array[i]){
                            for (int j = i; j < n; j++) {
                                array[j] = array[j+1];
                            }
                            n--;
                        }
                    }
                }
                case 6->{
                    int val;
                    System.out.print("Enter element for insert = "); val = scan.nextInt();
                    for (int i = 0 ; i < n ; i++ ) {
                        if ( val == array[i]){
                            for (int j = n; j >= i; j--) {
                                array[j] = array[j-1];
                            }
                            n++;
                            System.out.print("Enter new element of array["+i+"] = "); array[i] = scan.nextInt();
                            break;
                        }
                    }
                }
                case 7->{
                    int temp;
                    for (int i = 0; i < n; i++) {
                        for (int j = i+1; j < n; j++) {
                            if (array[i] > array[j]){
                                temp     = array[i];
                                array[i] = array[j];
                                array[j] = temp;
                            }
                        }
                    }
                    for (int i = 0 ; i < n ; i++ ) {
                        System.out.println("Element of array["+i+"] = "+array[i]);
                    }
                }
                case 8 ->{
                    int add;
                    System.out.print("Enter new size of array[0->"+(50-n)+"] = "); add = scan.nextInt();
                    for (int i = n; i < n+add; i++) {
                        System.out.print("Enter element of array["+i+"] = "); array[i] = scan.nextInt();
                    }
                    n+=add;
                }
                case 9-> n=0;
            }
        }while (op!=10);
    }
}
