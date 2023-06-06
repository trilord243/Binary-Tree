/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary.tree;

/**
 *
 * @author Escal
 */
public class BinarySearchTree {
    private Node root;
    


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    public boolean isEmpty(){
        return root==null;
    
    
    }
    
    public boolean insert(int value){
        Node newNode=new Node(value);
        if(isEmpty()){
            setRoot(newNode);
            return true;
        
        }else{
            Node temp=getRoot();
            while(true){
                if(newNode.getValue()==temp.getValue()) return false;
                if(newNode.getValue()<temp.getValue()){
                    if(temp.getLeft()==null){
                        temp.setLeft(newNode);
                        return true;
                    
                    }
                    temp=temp.getLeft();
                    
                    
                }else{
                    if(temp.getRight()==null){
                        temp.setRight(newNode);
                        return true;
                    
                    }
                    temp=temp.getRight();
                    
                
                
                }
            
            
            }
            
    
    
    }
    
    
    }
    
    public boolean contains(int value){
        if(getRoot()==null) return false;
        Node temp=getRoot();
        while(temp!=null){
            if(temp.getValue()>value){
                temp=temp.getLeft();
            }
            else if(temp.getValue()<value){
            
                temp=temp.getRight();
            }
            
            else if(temp.getValue()==value){
                return true;
            
            }
        
        
        }
        return false;
                
    
    }
    
    
}
