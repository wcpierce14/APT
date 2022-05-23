/*
Write method getLeaves that finds and removes the leaves in a binary tree, repeating this process in a 
sequence of rounds until the tree is empty. The method returns an array representing each round of leaf 
removal until the tree is empty.
Leaves should be visited using an in-order traversal (first left, then right). Each round of leaf-removal 
is represented by a string with each leaf value removed separated by a space. See the examples for details.

The returned array contains as many strings are there are rounds of leaf-removal before the tree is empty.
*/

import java.util.*;

public class LeafCollector {

    private boolean isLeaf(TreeNode t) {
        if(t == null) {
            return false;
        }
        if(t.left == null && t.right == null) {
            return true;
        }

        else {
            return false;
        }
    }

    private void collectAndRemove(TreeNode root, List<String> list) {
        if(root == null) {
            return;
        }
            String level = "";
            if(isLeaf(root.left)) {
                list.add("" + root.left.info);
                root.left = null;
            }
            if(!isLeaf(root.left)) {
                collectAndRemove(root.left, list);
            }
            if(isLeaf(root.right)) {
                list.add("" + root.right.info);
                root.right = null;
            }
            if(!isLeaf(root.right)) {
                collectAndRemove(root.right, list);
            }
    }


    public String[] getLeaves(TreeNode tree) {
        List<String> finalList = new ArrayList<>();
        List<String> tempList = new ArrayList<>();
        while(!isLeaf(tree)) {
            collectAndRemove(tree, tempList);
            String indexList = String.join(" ", tempList);
            finalList.add(indexList);
            tempList.clear();
        }
        finalList.add("" + tree.info);
        return finalList.toArray(new String[0]);
    }
}