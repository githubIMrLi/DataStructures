package com.linkedList;

public class josepfu {
    public static void main(String[] args) {
        //测试一把看看构建环形链表，和遍历是否ok
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(5);
        circleSingleLinkedList.showBoy();
        System.out.println();

        //测试一把小孩出圈是否正确
        circleSingleLinkedList.countBoy(1, 2, 5);

    }
}

//创建一个环形的单向链表
class CircleSingleLinkedList {
    //    创建一个first节点，当前没有编号
    private Boy first = null;

    //添加小孩节点，构建成一个环形链表
    public void addBoy(int nums) {
        //nums 做一个数据校验
       if (nums<1){
           System.out.println("输入参数有误");
           return;
       }

       Boy curBoy = null;
        for (int i = 1; i <= nums; i++) {
            Boy boy = new Boy(i);
            if (i == 1){
                first = boy;
                first.setNext(first);
                curBoy = first;
            }else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }

    //遍历当前环形链表
    public void showBoy() {
        //判断链表是否为null
        if (first == null) {
            System.out.println("链表为null");
            return;
        }

        //因为first不能动，因此我们仍然使用一个辅助指针完成遍历
        Boy curBoy = first;
        while (true) {
            System.out.printf("小孩的编号%d\n", curBoy.getNo());
            if (curBoy.getNext() == first) {
                //说明已经遍历完毕
                break;
            }
            curBoy = curBoy.getNext();
        }
    }

    /**
     * 根据用户的输入，计算出小孩出圈的顺序
     *
     * @param startNo  表示从第几个开始数数
     * @param countNum 表示数几下
     * @param nums     表示最初由多少小孩在圈中
     */
    public void countBoy(int startNo, int countNum, int nums) {
       //先进行参数校验
        if(first == null || startNo<0|| startNo>nums){
            return;
        }

        //创建helper辅助节点并移动到最后的位置
        Boy helper= first;

        while (true){
            if (helper.getNext() == first){
                break;
            }
            helper = helper.getNext();
        }

        //移动到startNo-1开始位置
        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }

        //开始移动countNums，定位到要移除的节点，循环移除
        while (true){
            if (helper == first){
                break;
            }

            for (int i = 0; i < countNum - 1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }

            System.out.println(first.getNo());
            first = first.getNext();
            helper.setNext(first);
        }

        System.out.println("finally"+first.getNo());
    }
}

// 创建一个Boy类，表示一个节点
class Boy {
    private int no; // 编号
    private Boy next; //指向下一个节点，默认null

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}