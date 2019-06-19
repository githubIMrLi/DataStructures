package com.sparsearray;

import java.util.Scanner;

public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        //测试
        System.out.println("测试数据模拟环形队列的案例");

        //创建一个环形队列
//        说明：设置为4，其队列的有效数据最大是3.
        CircleArrayQueue queue = new CircleArrayQueue(4);
        char key = ' '; //接受用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");

            key = scanner.next().charAt(0); // 接受一个字符
            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入一个数字：");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g': //取出数据
                    try {
                        int res = queue.getQueue();
                        System.out.printf("取出的数据是%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':  //查看队列头的数据
                    try {
                        int res = queue.headQueue();
                        System.out.printf("队列头的数据是%d\n", res);
                    } catch (Exception e) {
                        System.out.printf(e.getMessage());
                    }
                    break;
                case 'e':  //退出
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出~~");


    }
}

//使用数组模拟队列--编写一个ArrayQueue类
class CircleArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public CircleArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    //判断队列是否为满
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列满，不能添加");
            return;
        }
        //直接将数据加入
        arr[rear] = n;
        //将rear后移，必须考虑取模
        rear = (rear + 1) % maxSize;
    }

    //获取队列的数据，出队列
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空，不能取");
        }
        int value = arr[front];
        front = (front+1)%maxSize;
        return value;
    }

    //显示队列
    public void showQueue(){
        if (isEmpty()) {
            System.out.println("队列空，不能显示");
            return;
        }
        for (int i = 0; i <front+size() ; i++) {
            System.out.printf("arr[%d]=%d\n",i%maxSize,arr[i%maxSize]);
        }
    }

    //求当前队列有效个数
    public int size(){
        return (rear+maxSize-front)%maxSize;
    }

    //显示队列头数据，不是取数据
    public int headQueue(){
//        判断
        if (isEmpty()) {
            throw new RuntimeException("队列空，不能取");
        }
        return arr[front];
    }
}
