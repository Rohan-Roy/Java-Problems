class Node{
    Node left;
    Node right;
    Node data;
}

public class LeftViewOfTree
{
    static int maxLevel = 0;
    void leftView(Node root)
    {
        if(root!=null)
        leftView(root, 1);
        maxLevel = 0;
        return;
      // Your code here
    }
    
    void leftView( Node root, int level){
        if(root!=null && maxLevel < level)
        System.out.print(root.data+" ");
        if(level>maxLevel)
        maxLevel = level;

        if(root.left!=null){
            level++;
            leftView(root.left, level);
        }
        level--;
        if(root.right!=null){
            level++;
            leftView(root.right, level);
        }
    }
}
