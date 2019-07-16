package class_08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Code_04_Print_All_Permutations {

    public static ArrayList<String> printAllPermutations1(String str) {
        char[] chs = str.toCharArray();
        Queue<String> queue = process1(chs, 0);
        ArrayList<String> list = new ArrayList<>();
        while (!queue.isEmpty()){
            list.add(queue.poll());
        }
        return list;
    }

    public static Queue<String> process1(char[] chs, int i) {
        Queue<String> queue = new LinkedList();
        if (i == chs.length) {
//            System.out.println(String.valueOf(chs));
            queue.offer(String.valueOf(chs));
        }
        for (int j = i; j < chs.length; j++) {
            swap(chs, i, j);
            process1(chs, i + 1);
            swap(chs, i, j);
        }
        return queue;
    }

    public static void printAllPermutations2(String str) {
        char[] chs = str.toCharArray();
        ArrayList list = process2(chs, 0);
    }

    public static ArrayList process2(char[] chs, int i) {
        ArrayList list = new ArrayList();
        if (i == chs.length) {
            System.out.println(String.valueOf(chs));
            String s = String.valueOf(chs);
            list.add(s);
        }
        HashSet<Character> set = new HashSet<>();
        for (int j = i; j < chs.length; j++) {
            if (!set.contains(chs[j])) {
                set.add(chs[j]);
                swap(chs, i, j);
                process2(chs, i + 1);
                swap(chs, i, j);
            }
        }
        System.out.println(list);
        return list;
    }

    public static void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }

    public static void main(String[] args) {
        String test1 = "abc";
        ArrayList<String> list = printAllPermutations1(test1);
        System.out.println(list);
        System.out.println("======");
//        printAllPermutations2(test1);
//        System.out.println("======");

/*        String test2 = "acc";
        printAllPermutations1(test2);
        System.out.println("======");
        printAllPermutations2(test2);
        System.out.println("======");*/
    }

}
