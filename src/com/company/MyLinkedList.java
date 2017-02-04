package com.company;

/**
 * Created by orifjon9 on 2/3/2017.
 */
public class MyLinkedList<T> {
    protected Node<T> _nodeStart;
    protected Node<T> _nodeEnd;
    private int _size = 0;

    public MyLinkedList(){
        _nodeStart = null;
        _nodeEnd = null;
    }

    public void add(T _value){
        Node<T> node = new Node<T>(_value, null);

        if(_nodeStart == null){
            _nodeStart = node;
            _nodeEnd = _nodeStart;
        }
        else{
            _nodeEnd.setLink(node);
            _nodeEnd = node;
        }
    }

    public String toString(){
        Node<T> node;
        String ret = "";

        if(_nodeStart != null) {
            node = _nodeStart;
            while (node != null) {
                ret += node.getValue() + (node.getLink() != null ? "," : "");
                node = node.getLink();
            }
        }

        return ret;
    }

    public boolean search(T _value){
        Node<T> _node;
        if(_nodeStart!=null){
            _node = _nodeStart;

            while (_node != null){
                if(_node.compareTo(_value)) {
                    return true;
                }

                _node = _node.getLink();
            }
        }

        return false;
    }

}

class Node<T> {
    protected T value;
    protected Node<T> link;

    public Node() {
        this.value = null;
        this.link = null;
    }

    public Node(T _value, Node _link) {
        this.value = _value;
        this.link = _link;
    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getLink() {
        return this.link;
    }

    public void setValue(T _value) {
        this.value = _value;
    }

    public void setLink(Node<T> _link) {
        this.link = _link;
    }

    public boolean compareTo(T _value){
        return this.value.equals(_value);
    }
}

