package classOne.class_05;

import java.util.HashMap;

public class Code_02_RandomPool {

    public static class Pool {
        private HashMap<String, Integer> map1;
        private HashMap<Integer, String> map2;
        private int size;

        public Pool() {
            map1 = new HashMap<String, Integer>();
            map2 = new HashMap<Integer, String>();
            size = 0;
        }

        public void insert(String str) {
            if (str == null) {
                return;
            }
            map1.put(str, size);
            map2.put(size, str);
            size++;
        }

        public void delete(String key) {
            if (this.map1.containsKey(key)) {
                int deleteIndex = map1.get(key);
                int lastIndex = --size;
                String  lastValue = map2.get(lastIndex);
                map1.put(lastValue,deleteIndex);
                map2.put(deleteIndex,lastValue);
                map1.remove(key);
                map2.remove(lastIndex);
            }
        }

        public String getRandom() {
            if (size == 0) {
                return null;
            }
//            String str = map2.get(Math.random()*size);
//            return str;
            int randomIndex = (int) (Math.random() * this.size);
            return this.map2.get(randomIndex);
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.insert("nu");
        pool.insert("li");
        pool.insert("a");
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());

    }

}
