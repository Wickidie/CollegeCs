package tree;

public class BinaryTree {
    Node root;

    BinaryTree(){
        root = null;
    }

    public void insert(Node pivot, int num) {
        Node new_node = new Node(num);

        if (root == null) {
            root = new_node;
        }else if (pivot.num > new_node.num) {
            if (pivot.left == null) {
                pivot.left = new_node;
            }else{
                insert(pivot.left, num);
            }
        }else if (pivot.num < new_node.num) {
            if (pivot.right == null) {
                pivot.right = new_node;
            }else{
                insert(pivot.right, num);
            }
        }
    }

    public boolean search(Node pivot, int num) {
        if (root != null) {
            if (num == pivot.num) {
                return true;
            }else if(num < pivot.num){
                try {
                    return search(pivot.left, num);
                } catch (NullPointerException e) {
                    return false;
                }
            }else{
                try {
                    return search(pivot.right, num);
                } catch (NullPointerException e) {
                    return false;
                }
            }
        }
        return false;
    }

    // In, Pre, Post
    private String inOrder(Node pivot){
        String res = "";
        if (pivot != null) {
            if (pivot.left != null) {
                res += inOrder(pivot.left);
            }
            res += pivot.num + " ";
            if (pivot.right != null) {
                res += inOrder(pivot.right);
            }
        }
        return res;
    }
    public String inOrder() {
        return "InOrder = " + inOrder(root);
    }
    
    private String preOrder(Node pivot){
        String res = "";
        if (pivot != null) {
            res += pivot.num + " ";
            if (pivot.left != null) {
                res += preOrder(pivot.left);
            }
            if (pivot.right != null) {
                res += preOrder(pivot.right);
            }
        }
        return res;
    }
    public String preOrder() {
        return "PreOrder = " + preOrder(root);
    }
    
    private String postOrder(Node pivot){
        String res = "";
        if (pivot != null) {
            if (pivot.left != null) {
                res += postOrder(pivot.left);
            }
            if (pivot.right != null) {
                res += postOrder(pivot.right);
            }
            res += pivot.num + " ";
        }
        return res;
    }
    public String postOrder() {
        return "PostOrder = " + postOrder(root);
    }

    // Addo\itional
    public Node findNode(Node pivot, int num){
        if (pivot.num != num) {
            if (num == pivot.num) {
                return pivot;
            }else if(num < pivot.num){
                return findNode(pivot.left, num);
            }else{
                return findNode(pivot.right, num);
            }
        }
        return pivot;
    }

    public String getDescendant(Node pivot, int num) {
        String res = "";
        if (pivot != null) {
            if (pivot.left != null) {
                res += preOrder(pivot.left);
            }
            if (pivot.right != null) {
                res += preOrder(pivot.right);
            }
        }
        return res; 
    }

    public String getLeave(Node pivot, int num) {
        String res = "";
        if (pivot != null) {
            if (pivot.left != null) {
                res += preOrder(pivot.left);
            }
            if (pivot.right != null) {
                res += preOrder(pivot.right);
            }
        }
        return res; 
    }

    public String getAncestor(Node pivot, int num) {
        String res = "";
        if (pivot != null) {
            if (pivot.left != null) {
                res += preOrder(pivot.left);
            }
            if (pivot.right != null) {
                res += preOrder(pivot.right);
            }
        }
        return res; 
    }

    // Other Property
    public String childOf(int num) {
        String res = "";
        
        try {
            res += findNode(root, num).left.num + " ";
        } catch (NullPointerException e) {}
        try {
            res += findNode(root, num).right.num + " ";
        } catch (NullPointerException e) {}

        return "ChildOf " + num + " = " + res;
    }

    public String descendantOf(int num) {
        String res = "";
        
        try {
            res += getDescendant(findNode(root, num), num);
        } catch (NullPointerException e) {}

        return "DescendantOf " + num + " = " + res;
    }

    public String leaveOf(int num) {
        String res = "";
        
        try {
            res += getDescendant(findNode(root, num), num);
        } catch (NullPointerException e) {
            res += "null";
        }

        return "LeaveOf " + num + " = " + res;
    }

    

}
