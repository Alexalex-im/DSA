//      AVL Tree - Insert a Node

// Case 2 : Rotation is required

//              RL - right left condition
//                      1. Right rotation
//                      2. Left rotation

// RL - right left condition
//      Step 1 : rotate Right disbalancedNode.rightChild
//      Step 2 : rotate Left disbalancedNode


// rotateRight(disbalancedNode) 
//      newRoot = disbalancedNode.leftChild
//      disbalancedNode.leftChild = disbalancedNode.leftChild.rightChild
//      newRoot.rightChild = disbalancedNode
//      update height of disbalancedNode and newRoot
//      return newRoot


// rotateLeft(disbalancedNode) 
//      newRoot = disbalancedNode.rightChild
//      disbalancedNode.rightChild = disbalancedNode.rightChild.leftChild
//      newRoot.leftChild = disbalancedNode
//      update height of disbalancedNode and newRoot
//      return newRoot


//          Time Complexity : O(1)
//          Space Coimplexity : O(1)


package AVLTree.InsertANodeInAVLRightLeftCondition;

public class Main {
    public static void main(String[] args) {
        AVL newAVL = new AVL();
    }
}
