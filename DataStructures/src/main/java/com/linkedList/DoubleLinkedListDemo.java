package com.linkedList;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        System.out.println("双向链表的测试");
        HeroNode2 hero1 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 hero2 = new HeroNode2(2, "卢俊义", "玉麒麟");
        HeroNode2 hero3 = new HeroNode2(3, "吴用", "智多星");
        HeroNode2 hero4 = new HeroNode2(4, "林冲", "豹子头");

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(hero1);
        doubleLinkedList.add(hero2);
        doubleLinkedList.add(hero3);
        doubleLinkedList.add(hero4);

        doubleLinkedList.list();

        //修改
        HeroNode2 newHeroNode = new HeroNode2(4, "公孙胜", "入云龙");
        doubleLinkedList.update(newHeroNode);

        System.out.println("\n修改后的双向链表");
        doubleLinkedList.list();

        //删除
        doubleLinkedList.del(3);
        System.out.println("\n删除后的双向链表");
        doubleLinkedList.list();
    }
}

//  创建一个双向链表的类
class DoubleLinkedList {
    //    先初始化一个头节点，头节点不要动，不存放具体的数据
    private HeroNode2 head = new HeroNode2(0, "", "");

    //返回头节点
    public HeroNode2 getHead() {
        return head;
    }

    //1 对于双向链表，我们可以直接找到要删除的这个节点
    //2 找到后自我删除即可
    public void del(int no) {

//        判断当前链表是否为null
        if (head.next == null){
            System.out.println("链表为null，无法删除");
        }

        HeroNode2 temp = head.next;
        boolean flag = false;//标志是否找到待删除节点
        while (true) {
            if (temp == null) { //已经到链表的最后
                break;
            }
            if (temp.no == no) {
                //找到待删除节点前一个节点temp
                flag = true;
                break;
            }
            temp = temp.next;
        }
//        判断flag
        if (flag) {
            //找到
//            temp.next = temp.next.next;  单向链表
            temp.pre.next = temp.next;
            //这里有问题
//            如果是最后一个节点，就不需要执行下面这句话，否则会出现空指针
            if (temp.next != null){
                temp.next.pre = temp.pre;
            }

        } else {
            System.out.printf("要删除的 %d 节点不存在", no);
        }
    }

    //修改一个节点的内容,可以看到双向链表的节点内容修改和单向链表一样
    //修改节点的信息，根据no编号来修改，即no编号不能改
    public void update(HeroNode2 newHeroNode) {
        //判断是否为null
        if (head.next == null) {
            System.out.printf("链表为null");
            return;
        }
//        找到需要修改的节点，根据no编号
//        定义一个辅助变量
        HeroNode2 temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;//已经遍历完链表
            }
            if (temp.no == newHeroNode.no) {
                //找到了
                flag = true;
                break;
            }
            temp = temp.next;
        }
//        根据flag判断是否找到要修改的节点
        if (flag) {
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {//没有找到
            System.out.printf("没有找到编号 %d 的节点\n", newHeroNode.no);
        }

    }


    //添加一个节点到双向链表的最后
    public void add(HeroNode2 heroNode) {
        //因为head节点不能动，因此我们需要一个辅助变量 temp
        HeroNode2 temp = head;
        //遍历链表，找到最后
        while (true) {
            //找到链表的最后
            if (temp.next == null) {
                break;
            }
            //如果没有找到最后，将temp后移
            temp = temp.next;
        }
//        当退出while循环时，temp就指向了链表的最后
//        形成一个双向链表
        temp.next = heroNode;
        heroNode.pre = temp;

    }


    //遍历双向链表的方法
    //    显示链表[遍历]
    public void list() {
//    判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
//    因为头节点不能动，因此需要一个辅助变量来遍历
        HeroNode2 temp = head.next;
        while (true) {
            //判断是否到链表最后
            if (temp == null) {
                break;
            }
//           输出节点信息
            System.out.println(temp);
//            将temp后移，一定小心
            temp = temp.next;
        }
    }



}
// 定义HeroNode2，每个HeroNode对象就是一个节点
class HeroNode2 {
    public int no;
    public String name;
    public String nickname; //外号
    public HeroNode2 next; //指向下一个节点，默认为null
    public HeroNode2 pre; //指向前一个节点，默认为null

    //    构造器
    public HeroNode2(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    //    为了显示方法，我们重写toString方法
    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + "'" + '}';
    }
}