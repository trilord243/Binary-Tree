/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary.tree;

/**
 *
 * @author Escal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree newTree =new BinarySearchTree();
        
        newTree.insert(47);
        newTree.insert(21);
        newTree.insert(76);
        newTree.insert(18);
        newTree.insert(52);
        newTree.insert(420);
        
        //Value Expected
        newTree.insert(27);
        System.out.println(newTree.getRoot().getLeft().getRight().getValue());
        System.out.println(newTree.contains(52));
        
        
    }
    
}
