// https://leetcode.com/problems/middle-of-the-linked-list/

import java.util.ArrayList;
import java.util.List;

public class MiddleNode {
    public static void main(String[] args) {
        ListNode node = ListNode.createLinkedList(new int[] { 1, 2, 3, 4, 5, 6 });

        ListNode result = middleNode2(node);
        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }

    public static ListNode middleNode1(ListNode head) {
        List<ListNode> copy = new ArrayList<>();
        copy.add(head);

        while (head.next != null) {
            copy.add(head.next);
            head = head.next;
        }

        return copy.get(copy.size() / 2);
    }

    public static ListNode middleNode2(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
    }
}

class ListNode {
    int value;
    ListNode next;

    ListNode() {
    }

    ListNode(int value) {
        this.value = value;
    }

    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public static ListNode createLinkedList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }
}