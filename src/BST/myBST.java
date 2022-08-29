package BST;

public class myBST {
    public treeNode mroot;
    public myBST() {

    }
    public treeNode inSert(treeNode root, int value){
        treeNode newNode = new treeNode(value);
        //TH 1 root = null
        if( root == null){
            root = newNode;
            return root;
        }else{
            treeNode temp = root;
            while (true){
                if(value >temp.val){
                    if(temp.right==null){
                        temp.right = newNode;
                        break;
                    } else{
                        temp = temp.right;
                    }
                } else if( value < temp.val){
                    if(temp.left==null){
                        temp.left = newNode;
                        break;
                    } else{
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }
    public treeNode inSertinto(treeNode root, int value){
        if(root == null){
            return new treeNode(value);
        }
        if(value < root.val){
            if( root.left == null){
                root.left = new treeNode(value);
            }else{
                inSertinto(root.left, value);
            }
        }else if( value > root.val){
            if( root.right == null){
                root.right = new treeNode(value);
            }else {
                inSertinto(root.right, value);
            }
        }
        return root;
    }
    public treeNode findLeftModeNode(treeNode root){
        if(root==null) return null;
        treeNode mostLeft = root;
        while(mostLeft.left != null){
            mostLeft = mostLeft.left;
        }
        return mostLeft;
    }
    public treeNode deleteNode( treeNode root,int key ){
        if( root == null) return null;
        if( key < root.val){
           root.left=deleteNode(root.left, key);

        }else if(key > root.val){
            root.right=deleteNode(root.right, key);

        }else{
            // xoa node
//TH1 node can xoa la node las
            if(root.left==null && root.right==null){
                return null;
            }
//TH2 chi co mot cay con ben trai
            if(root.left!=null && root.right==null){
                return root.left;
            }
//TH2' chi co mot cay con ben phai
            if(root.left==null && root.right!=null){
                return root.right;
            }
//TH3 ton tai 2 con
// tim node trai cung cua cai con ben phai
            treeNode leftmodeNode = findLeftModeNode(root.right);
            root.val = leftmodeNode.val;
            deleteNode(root.right,leftmodeNode.val);
        }
        return root;
    }
    public treeNode searchBST(treeNode root, int key) {
        if( root==null)
            return null;
        if(key<root.val){
            return searchBST(root.left, key);
        }else if( key>root.val){
            return searchBST(root.right, key);
        }else{
            return root;
        }
    }
    // Node - L - R
    public static void PreOder(treeNode currentNode)
    {
        if(currentNode == null) return;
        // Duyet currentNode truoc
        System.out.print(currentNode.val + " ");

        // Duyet ben trai | Duyet ben phair
        PreOder(currentNode.left);
        PreOder(currentNode.right);
    }

    //  L - Node - R
    public static void InOder(treeNode currentNode)
    {
        if(currentNode == null) return;

        // Duyet ben trai | Duyet ben phair
        InOder(currentNode.left);

        // Duyet currentNode truoc
        System.out.print(currentNode.val + " ");

        InOder(currentNode.right);
    }

    // L R Node
    public static void PostOder(treeNode currentNode)
    {
        if(currentNode == null) return;

        // Duyet ben trai | Duyet ben phair
        PostOder(currentNode.left);
        PostOder(currentNode.right);

        // Duyet currentNode truoc
        System.out.print(currentNode.val + " ");
    }

}
