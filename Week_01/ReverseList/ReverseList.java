package cn.test.demo;




// Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
      public ListNode reverseList(ListNode head){
            ListNode prev = null; //前驱节点没有，则指向空。
            ListNode curr = head; // 当前节点，指向头节点。
            for ( curr != null ) {
                ListNode nextTemp = curr.next ; // 将下一个节点存入临时变量。
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
      }
  }