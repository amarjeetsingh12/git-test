package com.rest.list;

/**
 * Created by amarjeet.singh on 17/12/14.
 */
public class LinkedList {
    Node head;
    public void add(Data data){
        Node newNode=new Node(null,data);
        if(this.head==null){
            this.head=newNode;
        }else{
            Node currentNode=head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }
    }
    public void reverseList(){
        Node prev = null;
        Node currentNode=this.head;
        while(currentNode!=null){
            Node tmpNext=currentNode.next;
            currentNode.next=prev;
            prev=currentNode;
            currentNode=tmpNext;
        }
        this.head=prev;
    }
    class Node{
        Node next;
        Data data;

        public Node(Node next, Data data) {
            this.next = next;
            this.data = data;
        }
    }
    public static class Data{
        String value;

        public Data(String value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        Data o1=new Data("first");
        Data o2=new Data("second");
        Data o3=new Data("third");
        Data o4=new Data("fourth");
        list1.add(o1);
        list1.add(o2);
        list1.add(o3);
        list1.add(o4);

        LinkedList list2=new LinkedList();
        Data o5=new Data("fifth");
        Data o6=new Data("sixth");
        Data o7=new Data("seventh");
        list2.add(o5);
        list2.add(o6);
        list2.add(o7);
        list2.add(o2);

    }

}
