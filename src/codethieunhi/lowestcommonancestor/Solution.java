package codethieunhi.lowestcommonancestor;

public class Solution {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // If the value of root node is greater than the value of p node and less than the value of q node...
        if (root.val > p.val && root.val < q.val) {
            return root;
        }
        // If the value of the p node and the q node is less than the value of root node...
        else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        // If the value of p node and the q node is greater than the value of root value...
        else if (root.val < q.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
    }
}
