package com.bittech.hello;

import java.util.Scanner;
public class deleat {
    class Node {
        private Node next;
        private int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (this.head == null) {
            this.head = node;
            this.head.next = node;
        } else {
            while (cur.next != this.head) {
                cur = cur.next;
            }
            cur.next = node;
            node.next = this.head;
        }
    }
public int getLength(){
    Node cur = this.head;
    int length = 0;
    while(cur.next != this.head){
        length++;
        cur = cur.next;
    }
    return length;
    }
    public int remove() {
        Node cur = this.head;
        while (getLength() != 1) {
            Node willDel = cur.next.next;
            Node prev = cur.next;
            prev.next = willDel.next;
            cur = cur.next;
        }
        return cur.data;
    }
}
//public class deleat
//{
//    public static void main(String[] args) {
//
//        Scanner str = new Scanner(System.in);
//        int k = str.nextInt();
//        text D = new text();
//        for(int i = 0;i < k;i++){
//            D.addLast(i);
//        }
//        System.out.println(D.remove());
//    }
//}
