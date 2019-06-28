package class_03;


public class Array_To_Stack_Queue {

    public static class ArrayStack {
        private Integer[] arr;
        private Integer size;

        public ArrayStack(int initSize) {
            if (initSize < 0) {
                throw new IllegalArgumentException("The init size is less than 0");
            }
            arr = new Integer[initSize];
            size = 0;
        }


        public void push(int obj) {
            if (size == arr.length) {
                throw new ArrayIndexOutOfBoundsException("The queue is full");
            }
            arr[size++] = obj;
        }

        public Integer peek() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException("The queue is null");
            }
            return arr[size - 1];
        }

        public Integer pop() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException("The queue is null");
            }
            return arr[--size];
        }


    }

    public static class ArrayQueue {
        private Integer start;
        private Integer end;
        private Integer size;
        private Integer[] arr;

        public ArrayQueue(int initSize) {
            if (initSize < 0) {
                System.out.println("initSize不能小于0");
                return;
            }
            start = 0;
            end = 0;
            size = 0;
            arr = new Integer[initSize];
        }

        public void push(int num) {
            if (size == arr.length) {
                System.out.println("队列满");
            }
            size++;
            arr[end] = num;
            end = end == arr.length - 1 ? 0 : end + 1;

        }

        public Integer pop() {
            if (size == 0) {
                return null;
            }
            size--;
            int temp = arr[start];
            start = start == arr.length - 1 ? 0 : start + 1;
            return temp;
        }

        public Integer peek() {
            if (size == 0) {
                return null;
            }
            return arr[start];
        }
    }


    public static void main(String[] args) {

    }
}
