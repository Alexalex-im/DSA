//      AVL Tree - Insert a Node

// Case 2 : Rotation is required

//          LR - right right Condition
//              - rotate Left disbalancedNode

// rotateLeft(disbalancedNode) 
//      newRoot = disbalancedNode.rightChild
//      disbalancedNode.rightChild = disbalancedNode.rightChild.leftChild
//      newRoot.leftChild = disbalancedNode
//      update height of disbalancedNode and newRoot
//      return newRoot


// rotateRight(disbalancedNode) 
//      newRoot = disbalancedNode.leftChild
//      disbalancedNode.leftChild = disbalancedNode.leftChild.rightChild
//      newRoot.rightChild = disbalancedNode
//      update height of disbalancedNode and newRoot
//      return newRoot


//          Time Complexity : O(1)
//          Space Coimplexity : O(1)


package AVLTree.InsertANodeInAVLRightRightCondition;

public class Main {
    public static void main(String[] args) {
        AVL newAVL = new AVL();
    }
}
