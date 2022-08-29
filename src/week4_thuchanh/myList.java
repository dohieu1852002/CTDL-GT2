package week4_thuchanh;

import java.util.LinkedList;
import java.util.Scanner;

public class myList {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        int delIndex;
        delIndex= scanner.nextInt();
        list.remove(delIndex);
        System.out.println(list);
    }
}
