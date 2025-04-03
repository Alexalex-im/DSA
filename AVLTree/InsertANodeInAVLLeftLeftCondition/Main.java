//      AVL Tree - Insert a Node

//      Case 1 : Rotation is not required    

//      Case 2 : Rotation is required
//               LL - left left condition
//               LR - left right condition
//               RR - right right condition
//               RL - right left condition

//       LL - Left Left Condition

//      Algorithm of Left Left (LL) Condition 

//      rotateRight(disbalancedNode) {
//      newRoot = disbalancedNode.leftChild         // Null
//      disbalancedNode.leftChild = disbalancedNode.leftChild.rightChild
//      newRoot.rightChild = disbalancedNode        // O(1)
//      update height of the disbalancedNode and newRoot
//      return newRoot
//      }

//      Time Complexity : O(1)
//      Space Complexity : O(1)



package AVLTree.InsertANodeInAVLLeftLeftCondition;

public class Main {
    public static void main(String[] args) {
        AVL newAVL = new AVL();
    }
}
