import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        Collection colist = Collections.unmodifiableCollection(list);
//        colist.add(1);

        char[] c = "abc".toCharArray();
        System.out.println(c[0]);
        System.out.println(((1+0)&1)==0);
    }
}
