package cn.test.demo;

import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import javax.swing.tree.TreeNode;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder (TreeNode root, List <Integer> res) {
        if (root != null) {
            if ( root.left != null) {
                inorder(root.left, res);
            }
            res.add(root.val);
            if ( root.right != null) {
                inorder(root.right,res);
            }
        }

    }
}

public class BinaryInorder{
    public static void main(String[] args) {

    }
}