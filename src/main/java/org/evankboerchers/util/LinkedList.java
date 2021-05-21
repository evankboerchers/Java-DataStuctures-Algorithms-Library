package org.evankboerchers.util;

public class LinkedList<E> {

    private Node<E> head;
    private Node<E> tail;

    public LinkedList() {
        head = null;
    }

    public void add(E e){

        Node<E> newNode = new Node<E>(tail, null, e);

        if(tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<E> oldTail = tail;
            oldTail.setTail(newNode);
        }
    }

    private static class Node<E> {
        private Node<E> head;
        private Node<E>  tail;
        private E element;

        Node(Node<E> head, Node<E> tail, E element) {
            this.head = head;
            this.tail = tail;
            this.element = element;
        }

        public Node<E>  getHead() {
            return head;
        }

        public void setHead(Node<E>  head) {
            this.head = head;
        }

        public Node<E>  getTail() {
            return tail;
        }

        public void setTail(Node<E> tail) {
            this.tail = tail;
        }
    }
}
