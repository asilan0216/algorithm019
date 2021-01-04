/**
 * 105. 从前序与中序遍历序列构造二叉树
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTreeHelper(inorderMap, preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode buildTreeHelper(Map<Integer, Integer> inorderMap, int[] preorder, int pstart, int pend, int[] inorder, int istart, int iend) {
        if (pstart == pend) {
            return null;
        }
        int proot = preorder[pstart];
        int irootindex = inorderMap.get(proot);
        int leftNum = irootindex - istart;
        TreeNode rootNode = new TreeNode(proot);
        rootNode.left = buildTreeHelper(inorderMap, preorder, pstart + 1, pstart + 1 + leftNum, inorder, istart, irootindex);
        rootNode.right = buildTreeHelper(inorderMap, preorder, pstart + 1 + leftNum, pend,  inorder, irootindex + 1, iend);
        return rootNode;
    }
}