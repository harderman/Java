package com.bittech.hello;

import java.util.*;

public class TextBinaryTree {
    class TreeNode {
        char value;
        TreeNode left;
        TreeNode right;

        TreeNode(char value) {
            this.value = value;
        }
    }

    //根据字符串创建二叉树
    private int i = 0;
    private TreeNode CreateTextTree(String s) {
        TreeNode root = null;
        if (s.charAt(i) != '#') {
            root = new TreeNode(s.charAt(i));
            i++;
            root.left = CreateTextTree(s);
            root.right = CreateTextTree(s);
        } else {
            i++;
        }
        return root;
    }

    //二叉树的前序遍历
    private void binaryTreePrevOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        binaryTreePrevOrder(root.left);
        binaryTreePrevOrder(root.right);
    }

    //二叉树的中序遍历
    private void binaryTreeInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        binaryTreeInOrder(root.left);
        System.out.print(root.value + " ");
        binaryTreeInOrder(root.right);
    }

    //二叉树的后序遍历
    private void binaryTreePostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        binaryTreePostOrder(root.left);
        binaryTreePostOrder(root.right);
        System.out.print(root.value + " ");
    }

    //结点个数
    private int getSide(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getSide(root.left) + 1 + getSide(root.right);
    }
    //叶子节点个数


//第K层节点个数


    //查找
    private TreeNode find(TreeNode root, int value) {
        if (root == null) {
            return null;
        }
        if (root.value == value) {
            return root;
        }
        TreeNode ret = find(root.left, value);
        if (ret != null) {
            return ret;
        }
        ret = find(root.right, value);
        if (ret != null) {
            return ret;
        }
        return null;
    }

    //树的高度
    private int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
//        if(left>right){
//            return left+1;
//        }
//        else{
//            return right+1;
//        }
        return left>right?left+1:right+1;
    }

    //前序遍历非递归
    void binaryTreePrevOrderR(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode top = null;
        while(cur != null||!stack.empty()){
            while(cur != null){
                stack.push(root);
                System.out.println(stack.pop().value+" ");
                cur = cur.left;
            }
            top = stack.pop();
            cur = top.right;
        }
        System.out.println();
    }

    //中序遍历非递归
    void binaryTreeInOrderNonR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode top = null;
        while (cur != null||!stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            top = stack.pop();
            System.out.println(top.value + " ");
            cur = top.right;
        }
        System.out.println();
    }

    //后续遍历非递归
    void binaryTreePostOrderNonR(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null||!stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if(cur.right == null||cur.right == prev){
                stack.pop();
                System.out.println(cur.value+" ");
                prev = cur;
                cur = null;
            }else{
                cur = cur.right;
            }
        }
        System.out.println();
    }
    //二叉树的层序遍历
    void binaryTreeLevelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            System.out.println(cur.value+" ");
            if(root.left != null){
                queue.offer(root.left);
            }
            if(root.right != null){
                queue.offer(root.right);
            }

        }
    }
    //是否为完全二叉树
    int binaryTreeComplete(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();
            if(top != null){
                queue.offer(top.left);
                queue.offer(top.right);
            }
            else{
                break;
            }
        }
        if(queue.isEmpty()){
            return 0;
        }
        else{
            return 1;
        }
    }
}