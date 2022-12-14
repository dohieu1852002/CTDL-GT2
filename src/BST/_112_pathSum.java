package BST;

public class _112_pathSum {
    public boolean isLeaf(treeNode node){
        return node.left == null && node.right == null;
    }

    public boolean duyet(treeNode curNode, int curSum, int targetSum)
    {
        //B1: Dieu kien dung | Bai toan co so
        if(curNode == null) return false;

        curSum += curNode.val;
        if(isLeaf(curNode)){
            return curSum == targetSum;
        }

        // Duyet sang 2 cay con ben de kiem tra
        boolean kqBenTrai = duyet(curNode.left, curSum, targetSum);
        boolean kqBenPhai = duyet(curNode.right, curSum, targetSum);

        return kqBenPhai || kqBenTrai;
    }

    public boolean hasPathSum(treeNode root, int targetSum) {
        return duyet(root, 0, targetSum);
    }
}
