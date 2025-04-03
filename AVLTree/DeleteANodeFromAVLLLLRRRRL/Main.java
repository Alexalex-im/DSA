//              AVL Tree - Delete a Node

//      Case 1 - Rotation is not required
//      Case 2 - Rotation is required (LL, LR, RR, RL)

//      Case 1 - Rotation is not required
//              - The node to be deleted is a leaf node 
//              - The node to be deleted has a child node
//              - The node to be deleted has two children node 

//       Case 2 - Rotation is required
//              - Left Left Condition (LL)
//              - Left Right Condition (LR)
//              - Right Right Condition (RR)
//              - Right Left Condition (RL)



package AVLTree.DeleteANodeFromAVLLLLRRRRL;

public class Main {
    public static void main(String[] args) {
        AVL newAVL = new AVL();
        newAVL.insert(5);
        newAVL.insert(10);
        newAVL.insert(15);
        newAVL.insert(20);
        newAVL.levelOrder();
        
    }

}
