/**
 * @(#)DiGui.java, 2022/2/18.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.structure;


public class DiGui {
    void traverse(TreeNode root){
        if(root == null){
            return;
        }
        traverse(root.leftNode);
        System.out.println(root.data);
        traverse(root.rightNode);
    }


    void bst(TreeNode<Integer> node, int target){

        if(node.data == target){
            //
        }
        if(node.data < target){
            bst(node.leftNode,target);
        }

        if(node.data > target){
            bst(node.rightNode,target);
        }
    }


    TreeNode insertBST(TreeNode<Integer> root, int target){
        if(root == null){
            return new TreeNode(target);
        }

        if(root.data>target){
            root.leftNode = insertBST(root.leftNode,target);
        }
        if(root.data<target) {
            root.rightNode = insertBST(root.rightNode,target);
        }

        return root;
    }




    TreeNode searchBST(TreeNode<Integer> root,int target){
        if(root==null){
            return null;
        }

        if(root.data> target){
          return  searchBST(root.leftNode,target);
        }

        if(root.data < target){
            return  searchBST(root.rightNode,target);
        }

        return root;
    }



}