package br.com.gusto.fatec.ed.exercicios.ex3.model;

public class Node {
    private final Object element;
    private Node next;

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Node(Object element) {
        this(element, null);
    }

    public Object getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
