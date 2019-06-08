/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import static java.lang.Math.random;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Maria Mikhaleva
 * @version dated Mar 14 2019
 */
public class Launcher {

    public static void main(String[] args) {
        List<Tree> trees = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            Tree tree = new Tree();
            for (int j = 0; j < 60; j++) {
                tree.insert(-100 + (int) (Math.random() * 200));
            }
            trees.add(tree);
        }

        int count = 0;

        for (Tree tree : trees) {
            if (tree.isBalanced(tree.root)) {
                count++;
            }
        }
        System.out.println("Total trees: " + trees.size());
        System.out.println("Balanced: " + count * 100/ trees.size() + "%");
    }

}
