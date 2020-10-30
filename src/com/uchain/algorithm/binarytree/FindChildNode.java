package com.uchain.algorithm.binarytree;

/**
 * @description  查找树的子结构
 */
public class FindChildNode {
    public static void main(String[] args) {

    }
    public boolean judge(ChildNode root,ChildNode subtree){
        if(subtree==null){
            return true;
        }
        if(root==null){
            return false;
        }

        if(root.val==subtree.val){
            return judge(root.left,subtree.left)&&judge(root.right,subtree.right);
        }
        return false;
    }

    public boolean hasSubTree(ChildNode root1,ChildNode root2){
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val==root2.val){
            if(judge(root1,root2)){
                return true;
            }
        }
        return hasSubTree(root1.left,root2)||hasSubTree(root1.right,root2);
    }
}
