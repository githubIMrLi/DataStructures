package xiaozhaoti;

import java.util.ArrayList;
import java.util.List;

public class threeDemo {

    public static int threeCount(int l,int r){
        if (l>r||l<1){
            throw  new RuntimeException("输入错误");
        }
        List<String> list = new ArrayList();
        String s ="1";
       list.add(s);
        for (int i = 2; i <= r; i++) {
            s = s+i+"";
            list.add(s);
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
          if (Integer.valueOf(list.get(i))%3==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = threeCount(2,5);
        System.out.println(count);
//        ArrayList<String> list = new ArrayList();
//        list.add("12");
//        Integer integer = Integer.valueOf(list.get(0));
//        System.out.println(integer);
    }
}
