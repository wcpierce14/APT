/*
Write a method that returns the number of nodes of a binary tree. 
The TreeNode class will be accessible when your method is tested.
*/

public class TreeCount {
    public int count(TreeNode tree) {
        if(tree == null) {
            return 0;
        }
        return 1 + count(tree.left) + count(tree.right);
    }
}