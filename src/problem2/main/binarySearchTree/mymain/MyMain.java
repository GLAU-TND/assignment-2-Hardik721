package problem2.main.binarySearchTree.mymain;

import problem4.binaryST.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyQueue preQueue = new MyQueue();
        MyQueue postQueue= new MyQueue();
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree(preQueue);
        myBinarySearchTree.insert(15);
        myBinarySearchTree.insert(10);
        myBinarySearchTree.insert(50);
        myBinarySearchTree.insert(55);
        myBinarySearchTree.insert(60);

        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());
        System.out.println("PreOrder:");
        preQueue.show();
        System.out.println("PostOrder:");
        postQueue.show();
        System.out.println();
    }
}
