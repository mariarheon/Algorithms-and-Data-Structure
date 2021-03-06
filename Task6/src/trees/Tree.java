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
public class Tree {

    private Node root;

    public Node find(int key) {
        Node cur = root;
        while (cur.person.id != key) {
            if (key < cur.person.id) {
                cur = cur.leftChild;
            } else {
                cur = cur.rightChild;
            }
            if (cur == null) {
                return null;
            }

        }
        return cur;
    }

    public void insert(Person person) {
        Node node = new Node();
        node.person = person;
        if (root == null) {
            root = node;
        } else {
            Node cur = root;
            Node parent;
            while (true) {
                parent = cur;
                if (person.id < cur.person.id) {
                    cur = cur.leftChild;
                    if (cur == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    cur = cur.rightChild;
                    if (cur == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild); //1
            root.display();          //2
            inOrder(root.rightChild);//3
            // 132 - обратный, 213 - прямой, 123 - симметричный
        }
    }

    public Node min() {
        Node cur, last = null;
        cur = root;
        while (cur != null) {
            last = cur;
            cur = cur.leftChild;
        }
        return last;
    }

    public Node max() {
        Node cur, last = null;
        cur = root;
        while (cur != null) {
            last = cur;
            cur = cur.rightChild;
        }
        return last;
    }

    public boolean delete(int id) {
        Node cur = root;
        Node parent = root;
        boolean isLeftChild = true; //false - right

        while (cur.person.id != id) {
            parent = cur;
            if (id < cur.person.id) {
                isLeftChild = true;
                cur = cur.leftChild;
            } else {
                isLeftChild = false;
                cur = cur.rightChild;
            }

        }

        if (cur == null) {
            return false;
        }

        //found our leaf
        //no children
        if (cur.leftChild == null && cur.rightChild == null) {
            if (cur == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } // if one child
        else if (cur.rightChild == null) { // no right
            if (cur == root) {
                root = cur.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = cur.leftChild;
            } else {
                parent.rightChild = cur.leftChild;
            }
        } else if (cur.leftChild == null) { //no left
            if (cur == root) {
                root = cur.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = cur.rightChild;
            } else {
                parent.rightChild = cur.rightChild;
            }
        } // both children
        else {
            Node successor = getSuccessor(cur);
            if (cur == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = cur.leftChild;
        }

        return true;
    }

    public Node getSuccessor(Node node) {
        Node successorParent = node;
        Node successor = node;
        Node cur = node.rightChild;

        while (cur != null) {
            successorParent = successor;
            successor = cur;
            cur = cur.leftChild;
        }
        if (successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;
    }

    public void displayT() {
        inOrder(root);
    }
}
