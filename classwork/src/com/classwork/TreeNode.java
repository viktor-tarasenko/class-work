package com.classwork;

public class TreeNode/* implements Iterable<LinkedList> */ {
    private static int value;
    private TreeNode parent = null;
    private TreeNode left;
    private TreeNode right;

    public void add(TreeNode node){}

    public boolean contains(TreeNode node){}
    public int size(){};

    //
    public TreeNode get(int index){}

    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        TreeNode.value = value;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }


//    public TreeNode(int nodeValue){
//        nodeValue = value;
//    }
//
//    public Iterator<LinkedList> iterator() {
//        return null;
//    }
//
//    public TreeNode next(){
//        return null;
//    }
//
//    public TreeNode hasNext(){
//        return null;
//    }
//
//    public TreeNode hasPrevious(){
//        return null;
//    }
}
