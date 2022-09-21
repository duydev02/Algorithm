package codethieunhi.invertbinarytree;

public class Solution {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // Call the function recursively for the left subtree...
        invertTree(root.left);
        // Call the function recursively for the right subtree...
        invertTree(root.right);
        // Swapping process...
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        return root;
    }

    public static void main(String[] args) {

    }
}
