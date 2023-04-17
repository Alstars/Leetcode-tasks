package com.example.leetcodetasks.done.mergekSortedLists23;


/**
 * Time Complexity O(n(log(k)))
 * Space complexity O(logn)
 */
public class MergeKSortedLists23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return mergesort(lists, 0, lists.length - 1);

    }

    ListNode mergesort(ListNode[] lists, int s, int e) {
        if (s == e) return lists[s];
        int mid = s + (e - s) / 2;
        ListNode left = mergesort(lists, s, mid);
        ListNode right = mergesort(lists, mid + 1, e);
        return merge(left, right);
    }

    ListNode merge(ListNode first, ListNode second) {
        ListNode startNode = new ListNode(0);
        ListNode tail = startNode;
        while (true) {
            if (first == null) {
                tail.next = second;
                break;
            }
            if (second == null) {
                tail.next = first;
                break;
            }
            if (first.val < second.val) {
                tail.next = first;
                first = first.next;
                tail = tail.next;
            } else {
                tail.next = second;
                second = second.next;
                tail = tail.next;
            }
        }
        return startNode.next;
    }
}
