package com.uchain.algorithm.binarytree;

/**
 * @description 构建二叉树的镜像
 *
 */
public class BuildTreeMirror {
    public static void main(String[] args) {

    }

    public static void buildMirror(MirrorNode root){
        if(root==null){
            System.out.println("初始镜像二叉树为空");
        }
        if(root.left ==null || root.right==null) {
            return ;
        }
        MirrorNode node=root.left;
        root.left=root.right;
        root.right=node;

        buildMirror(root.left);
        buildMirror(root.right);



    }
}
