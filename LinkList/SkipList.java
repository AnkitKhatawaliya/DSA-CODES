package LinkList;

// Link => https://www.sanfoundry.com/java-program-implement-skip-list/
class SkipNode{
         
    int element;
    SkipNode right;
    SkipNode down;

    public SkipNode(int x){
        this.element = x;
        this.right = null;
        this.down = null;
    }

    public SkipNode(int x, SkipNode rt, SkipNode dn){
        this.element =x;
        this.right = rt;
        this.down = dn;
    }
}

public class SkipList {

    private SkipNode header;
    private int infinity;
    private SkipNode bottom = null;
    private SkipNode tail = null;

    public SkipList( int info){
        infinity =info;
        bottom = new SkipNode(0);
        bottom.right = bottom.down = bottom;
        tail.right = tail;
        header = new SkipNode(infinity, tail, bottom);
    }

    public void insert(int x){
        SkipNode curNode = header;
        bottom.element = x;
        while(curNode!= bottom){
            while (curNode.element<x) {
                curNode =curNode.right;
                // If gapsize is 3 or at bottom level and must insert, then promote middle element
                if(curNode.down.right.right.element< curNode.element){
                    curNode.right = new SkipNode(curNode.element, curNode.right,curNode.down.right.right);
                    curNode.element = curNode.down.right.element;
                }else {
                    curNode = curNode.down;
                }
                if(header.right!=tail){
                    header = new SkipNode(infinity,tail,header);
                }
            }
        }

    }

    public static void main(String[] args) {
        SkipList s1 = new SkipList(10000);

        System.out.print("Enter an element to insert :");

    }
    
}
