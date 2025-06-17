class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class BinaryTreeDiameter {
    private int diameter = 0;
    
    private int height(TreeNode root) {
        if (root == null) return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        diameter = Math.max(diameter, leftHeight + rightHeight);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0; // Reset diameter for each call
        height(root);
        return diameter;
    }
    
    public static void main(String[] args) {
        BinaryTreeDiameter solution = new BinaryTreeDiameter();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Diameter of the tree: " + solution.diameterOfBinaryTree(root));
    }
}
