// https://leetcode.com/problems/middle-of-the-linked-list/

function middleNode1(head) {
  let copy = [head];

  while (head.next != null) {
    copy.push(head.next);
    head = head.next;
  }

  return copy[Math.floor(copy.length / 2)];
}

function middleNode2(head) {
  let middle = head;
  let end = head;

  while (end !== null && end.next !== null) {
    middle = middle.next;
    end = end.next.next;
  }

  return middle;
}

let node = ListNode.createLinkedList([1, 2, 3, 4, 5, 6]);

let result = middleNode2(node);
while (result !== null) {
  console.log(result.value);
  result = result.next;
}

class ListNode {
  constructor(value, next = null) {
    this.value = value;
    this.next = next;
  }

  static createLinkedList(values) {
    let head = new ListNode(values[0]);
    let current = head;

    for (let i = 1; i < values.length; i++) {
      current.next = new ListNode(values[i]);
      current = current.next;
    }

    return head;
  }
}
