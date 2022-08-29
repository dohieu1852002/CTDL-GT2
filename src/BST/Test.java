package BST;

public class Test {
    public static void main(String[] args) {
        myBST mytree = new myBST();
        mytree.mroot = mytree.inSertinto(mytree.mroot, 5);
        mytree.mroot = mytree.inSertinto(mytree.mroot, 1);
        mytree.mroot = mytree.inSertinto(mytree.mroot, 6);
        mytree.mroot = mytree.inSertinto(mytree.mroot, 0);
        mytree.mroot = mytree.inSertinto(mytree.mroot, 3);
        mytree.mroot = mytree.inSertinto(mytree.mroot, 7);
        mytree.mroot = mytree.inSertinto(mytree.mroot, 2);
        mytree.mroot = mytree.inSertinto(mytree.mroot, 4);
        System.out.println("Done");
        mytree.InOder(mytree.mroot);
        System.out.println(mytree);

    }
}
