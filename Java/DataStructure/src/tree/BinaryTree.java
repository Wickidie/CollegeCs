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
                res += inOrder(pivot.left).toString();
            }
            res += pivot.num + " ";
            if (pivot.right != null) {
                res += inOrder(pivot.right).toString();
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

    public Node findNodeParent(Node pivot, int num){
        if (pivot.left.num != num && pivot.right.num != num) {
            if (pivot.left.num == num || pivot.right.num == num) {
                return pivot;
            }else if(num < pivot.num){
                try {
                    return findNodeParent(pivot.left, num);
                } catch (NullPointerException e) {}
            }else{
                try {
                    return findNodeParent(pivot.right, num);
                } catch (NullPointerException e) {}
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

    public int getLeafCount(Node pivot) {
        try {
            if (pivot.left != null && pivot.right != null) {}
        } catch (Exception e) {}
        if (pivot.left != null && pivot.right != null) {
            return getLeafCount(pivot.left) + getLeafCount(pivot.right);
        }else{
            return 1; 
        }
    }
    
    public String getLeafNode(Node pivot) {
        try {
            if (pivot.left != null || pivot.right != null) {
                return getLeafNode(pivot.left) + getLeafNode(pivot.right);
            }else{
                return String.valueOf(pivot.num) + " "; 
            }
        } catch (Exception e) {}
        return "";
        
    } 

    // Other Property
    public String parentOf(int num) {
        Node temp_node = findNodeParent(root, num);
        if (temp_node.left.num == num 
        || temp_node.right.num == num) {
            return  "ParentOF " + num + " = " + temp_node.num;
        }
        return "NDAK ADA T_T";
    }

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

    public String leafCountOf() {
        return "Leaf Count From " + root.num + " = " + getLeafCount(root);
    }

    public String leafNodeOf() {
        return "Leaf Node From " + root.num + " = " + getLeafNode(root);
    }

    public static Node findMaximumKey(Node pivot){
        while (pivot.right != null) {
            pivot = pivot.right;
        }
        return pivot;
    }

    public Node deleteNode(Node pivot, int num) {
        if (root == null) {
            return null;
        }
        if (num < pivot.num) {
            pivot.left = deleteNode(pivot.left, num);
        }
        else if (num > pivot.num) {
            pivot.right = deleteNode(pivot.right, num);
        // If found
        }else{
            // Case 1: node to be deleted has no children (it is a leaf node)
            if (pivot.left == null && pivot.right == null){
                return null;
            }
            // Case 2: node to be deleted has two children
            else if (pivot.left != null && pivot.right != null){
                // find its inorder predecessor node
                Node predecessor = findMaximumKey(pivot.left);
 
                // copy value of the predecessor to the current node
                pivot.num = predecessor.num;
 
                // recursively delete the predecessor. Note that the
                // predecessor will have at most one child (left child)
                pivot.left = deleteNode(pivot.left, predecessor.num);
            }
            // Case 3: node to be deleted has only one child
            else {
                Node child;
                if (pivot.left != null) {
                    child = pivot.left;
                }else{
                    child = pivot.right;
                }
                pivot = child;
            }
        }
 
        return pivot;
    }

}
