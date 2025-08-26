package commonprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(89);
        list.add(99);
        list.get(1);
        list.remove(0);
        System.out.println(list);
        // how to create a multidimensional arraylist

        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
        // for (int i = 0; i < 7; i++) {
        //     list.add(new ArrayList<>());
        // }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                list2d.get(i).add(sc.nextInt());
            }
        }
    }

}
