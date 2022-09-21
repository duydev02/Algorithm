package leetcode.leetcode104_112;

public class _112_Path_Sum {

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public boolean duyet(TreeNode curNode, int curSum, int targetSum) {
        // B1: dieu kien dung | bai toan co so
        if (curNode == null) return false;

        curSum += curNode.val;
        if (isLeaf(curNode)) {
            return curSum == targetSum;
        }

        // Duyet sang 2 cay con ben de kiem tra
        boolean resultLeft = duyet(curNode.left, curSum, targetSum);
        boolean resultRight = duyet(curNode.right, curSum, targetSum);
        return resultLeft || resultRight;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return duyet(root, 0, targetSum);
    }
}
