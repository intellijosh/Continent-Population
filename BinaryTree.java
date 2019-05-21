//Program displaying the 7 continents population in binary search tree using in order traversal. Joshua Scott
public class BinaryTree {
    private static int rank;
    Node root;
    public void addNode(long key, String name,int rank){
        Node newNode = new Node(key, name, rank);
        if (root ==null){
            root = newNode;
        }else {
            Node focusNode = root;

            Node parent;
            while(true){
                parent = focusNode;

                if (key< focusNode.key){
                    focusNode = focusNode.leftChild;
                    if (focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
 public void inOrderTraverseTree(Node focusNode){
        if(focusNode !=null){
            inOrderTraverseTree((focusNode.leftChild));
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
 }
    public static void main(String[]args){
        BinaryTree theTree = new BinaryTree();

        theTree.addNode(4436224000L,"Asia",1);
        theTree.addNode(1216130000L,"Africa",2);
        theTree.addNode(738849000L,"Europe",3);
        theTree.addNode(579024000L,"North America",4);
        theTree.addNode(422535000L,"South America",5);
        theTree.addNode(38304000L,"Australia",6);
        theTree.addNode(1106L,"Antarctica",7);
        theTree.inOrderTraverseTree(theTree.root);
    }
}

class Node {
    long key;
    String name;
    int rank;

    Node leftChild;
    Node rightChild;

    Node(long key, String name, int rank) {
        this.key = key;
        this.name = name;
        this.rank = rank;
    }

    public String toString(){
        return name + " has a population of " + key+ " and ranks at  "+rank;
    }
}
