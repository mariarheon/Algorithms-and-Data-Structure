/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Maria Mikhaleva
 * @version dated Mar 14 2019
 */
public class Node {
    public Node leftChild;
    public Node rightChild;
    public Person person;
    
    public void display(){
        System.out.println("Name: " + person.name + ", age: " + person.age);
    }
}
