package be.rbe.learning.codewars;

import java.util.Objects;
import java.util.function.Function;

public class FunWithLists {

//    Implement the method map, which accepts a linked list (head) and a mapping
//    function, and returns a new linked list (head) where every element is the result of
//    applying the given mapping method to each element of the original list.
//
//    Make sure you do not modify the original list!
//
//    For example:
//    Given the list: 1 -> 2 -> 3, and the mapping function x => x * 2, map should return 2 -> 4 -> 6
//
//    The linked list is defined as follows:
//
//    function Node(data, next = null) {   this.data = data;   this.next = next; }

    // [DONE] create contracts
    // [ ] write test structure
    // [ ] iterate

    public Node map(Node head, Function<Object, Object> func) {
        Objects.requireNonNull(head, "map don't accept <null> as head parameter");
        Objects.requireNonNull(func, "map don't accept <null> as function parameter");
        return process(head, func);
    }

    public Node process(Node node, Function<Object, Object> func) {
        Objects.requireNonNull(node, "map don't accept <null> as head parameter");
        Objects.requireNonNull(func, "map don't accept <null> as function parameter");

        // todo
        return this.map(node.next, func);

    }


    public class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node apply(Function<Object, Object> function) {
            return new Node(function.apply(this.data), this.next);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(data, node.data) &&
                    Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, next);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

}
