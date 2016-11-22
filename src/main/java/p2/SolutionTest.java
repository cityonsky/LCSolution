package p2;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest extends TestCase {

    @Test
    public void testAddTwoNumbers() throws Exception {
        Solution.ListNode expect = makeList(new int[] {7, 0 , 8});
        Solution.ListNode a = makeList(new int[] {2, 4 , 3});
        Solution.ListNode b = makeList(new int[] {5, 6 , 4});

        Solution.ListNode result = new Solution().addTwoNumbers(a, b);
        Solution.ListNode itr = result;
        for (Solution.ListNode it = expect; it != null; it = it.next) {
            Assert.assertEquals(it.val, itr.val);
            itr = itr.next;
        }
    }

    private Solution.ListNode makeList(int[] list) {
        Solution.ListNode head = new Solution.ListNode(0);
        Solution.ListNode p = head;
        for (int i = 0; i < list.length; ++i) {
            p.next = new Solution.ListNode(list[i]);
            p = p.next;
        }
        return head.next;
    }
}