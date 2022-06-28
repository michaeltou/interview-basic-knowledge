/**
 * @(#)BinaryTree.java, 2022/2/5.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.structure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved. NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年02月05日 8:33 上午
 */
public class BinaryTree {

    TreeNode root = null;

    public TreeNode init() {
        TreeNode I = new TreeNode("I", null, null);
        TreeNode H = new TreeNode("H", null, null);
        TreeNode G = new TreeNode("G", null, null);
        TreeNode F = new TreeNode("F", null, null);
        TreeNode E = new TreeNode("E", null, I);
        TreeNode D = new TreeNode("D", G, H);
        TreeNode C = new TreeNode("C", E, F);
        TreeNode B = new TreeNode("B", D, null);
        TreeNode A = new TreeNode("A", B, C);
        return A;

    }


    public static void main(String[] args){

        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.init();
        binaryTree.levelTravel(root);

    }


    public void levelTravel(TreeNode currentNode){
        Queue<TreeNode> queue =  new LinkedList<TreeNode>();

        queue.add(currentNode);

        while(!queue.isEmpty()){

            currentNode = queue.poll();
            printNode(currentNode);

            if(currentNode.leftNode != null){
                queue.add(currentNode.leftNode);
            }
            if(currentNode.rightNode != null){
                queue.add(currentNode.rightNode);
            }

        }


    }


    public void preOrder(TreeNode currentNode){
        if(currentNode == null){
            return;
        }
        printNode(currentNode);
        preOrder(currentNode.leftNode);
        preOrder(currentNode.rightNode);

    }

    public void inOrder(TreeNode currentNode){
        if(currentNode == null){
            return;
        }
        inOrder(currentNode.leftNode);
        printNode(currentNode);
        inOrder(currentNode.rightNode);
    }
    public void postOrder(TreeNode currentNode){
        if(currentNode == null){
            return;
        }
        postOrder(currentNode.leftNode);
        postOrder(currentNode.rightNode);
        printNode(currentNode);
    }




    public void printNode(TreeNode node){
        System.out.println(node.data);
    }

}
