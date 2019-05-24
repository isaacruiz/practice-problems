/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import CodeLibrary.*;
/**
 *
 * @author Isaac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.addLeftChild(new BinaryTreeNode(2));
        root.addRightChild(new BinaryTreeNode(3));
        root.getRight().addLeftChild(new BinaryTreeNode(4));
        root.getRight().addRightChild(new BinaryTreeNode(5));
    }
}

