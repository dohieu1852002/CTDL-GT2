package linkList;

import java.util.List;

public class _203_remove {
    public static ListNode removeElements(ListNode head, int val){
        ListNode curNode = head;
        ListNode prevNode= null;
        while(curNode!=null){
            boolean bFound = false;
            if(curNode.val==val) {
                    bFound= true;
                if (prevNode == null) {
                    head = curNode.next;
                } else {
                    prevNode.next = curNode.next;
                }
            }
            prevNode = bFound == true ? prevNode : curNode;
            curNode = curNode.next;
        }
        return head;
}
}
