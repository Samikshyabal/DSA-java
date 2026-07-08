class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Step 1: Count the number of nodes
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: If first node has to be deleted
        if (count == n) {
            return head.next;
        }

        // Step 3: Move to the node before the one to delete
        temp = head;

        for (int i = 1; i < count - n; i++) {
            temp = temp.next;
        }

        // Step 4: Delete the node
        temp.next = temp.next.next;

        return head;
    }
}