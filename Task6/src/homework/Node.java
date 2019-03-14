/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Maria Mikhaleva
 * @version dated Mar 14 2019
 */
public class Node {
    int value;
    
    public Node leftChild;
    public Node rightChild;

    public Node(int value) {
        this.value = value;
    }
 
    
    
    public void display(){
        System.out.println("Value: " + value);
    }
}
