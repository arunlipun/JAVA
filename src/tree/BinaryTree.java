package tree;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static  class Node{
        int data;
        Node left,right;
        Node(int data){
            this .data=data;
            this.left=null;
            this.right=null;
        }


    }
    static class BinaryTrees{
        static int idx=-1;
        public static Node buildTree(int nodes[]){

            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }

    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node cur=q.remove();
            if(cur==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else{
                System.out.print(cur.data+" ");
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
    }

    public static int countofnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNode=countofnodes(root.left);
        int rightNode=countofnodes(root.right);
        return leftNode+rightNode+1;
    }
    public static int sumofnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumofnodes(root.left);
        int rightsum=sumofnodes(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int heightoftree(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=heightoftree(root.left);
        int rightheight=heightoftree(root.right);
        int MyHeight=Math.max(leftheight ,rightheight)+1;
        return MyHeight;
    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees tree=new BinaryTrees();
       Node root=tree.buildTree(nodes);
//        System.out.print(root.data);

        System.out.println("Preorder traversal of binary tree is ");
        preorder(root);
        System.out.println("Inorder traversal of binary tree is ");
        inorder(root);

        System.out.println("Postorder traversal of binary tree is ");
        postorder(root);

        System.out.println("Level order traversal of binary tree is ");
        levelorder(root);

        System.out.println("The total nof of Nodes are ");
        System.out.println(countofnodes(root));

        System.out.print("Sum of total Nodes:" + sumofnodes(root));
        System.out.print("Height of this tree is:" + heightoftree(root));
    }
}
