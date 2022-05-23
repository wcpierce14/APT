/*
Write a method that returns 1 if there is a root-to-leaf path whose node 
values sum to target and returns 0 if there is no such root-to-leaf path.
*/

import java.util.List;
import java.util.ArrayList;

public class PathSum {
    public int hasPath(int target, TreeNode tree){
        // List<Integer> totals = new ArrayList<>();
        if(tree == null) {
            return 0;
        }
        if(tree.left == null && tree.right == null) {
            if(tree.info == target) {
                return 1;
            }
            else {
                return 0;
            }
        }
        if(hasPath(target - tree.info, tree.left) == 1) {
            return 1;
        }
        else if(hasPath(target - tree.info, tree.right) == 1) {
            return 1;
        }
        
        return 0;
    }
}