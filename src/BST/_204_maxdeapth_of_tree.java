package BST;

public class _204_maxdeapth_of_tree {
    // maxDepth(root) => Di tim chieu cao cua cay root
    public int maxDepth(treeNode root) {
        // B1: Dieu kien dung | Bai toan co so
        if(root == null)
            return 0;

        // B2: Cong thuc de quy:
        int chieuCaoCayBenTrai = maxDepth(root.left);
        int chieuCaoCayBenPhai = maxDepth(root.right);

        int result = Math.max(chieuCaoCayBenPhai, chieuCaoCayBenTrai) + 1;
        return result;
    }
}
