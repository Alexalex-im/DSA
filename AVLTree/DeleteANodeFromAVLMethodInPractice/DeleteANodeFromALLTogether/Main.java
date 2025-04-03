//              AVL Tree - Delete a Node (All together)


//              - Left Left Condition (LL)
//              - Left Right Condition (LR)
//              - Right Right Condition (RR)
//              - Right Left Condition (RL)

//          Delete 40
//          Delete 50
//          The tree is balanced
//          Delete 60
//          The tree is disbalanced
//          Delete 80 
//          The tree is disbalanced
//          Insert 105
//          Delete 90



package AVLTree.DeleteANodeFromAVLMethodInPractice.DeleteANodeFromALLTogether;

public class Main {
    public static void main(String[] args) {
        AVL newAVL = new AVL();
        newAVL.insert(5);
        newAVL.insert(10);
        newAVL.insert(15);
        newAVL.insert(20);
        newAVL.levelOrder();
        newAVL.delete(5);
        System.out.println();
        newAVL.levelOrder();
    }

}
