public class problem15 {
    public static void main(String[] args) {
        //lattic paths: paths of a 20x20 square
        //can be translated to a string of 40 char
        //only consists of two different characters
        //how many different permutations does it have?
	    //or insert 20 'a's into a string of 20 'b's
        //how many different strings can it produce?
        //it is a choose M from N problem


        // List<Node> leafNodes = new ArrayList<>();
        Node root = new Node();
        long i = 0L;
        try {
            // leafNodes = root.goNext();
            i = root.goNext();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // System.out.println(leafNodes.size());
        System.out.println(i);

    }

    
}

class Node{
    private int x;
    private int y;

    Node() {
        x = 0;
        y = 0;
    }

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Gives you OutOfMemoryException
    // List<Node> goNext() {
    //     List<Node> list = new ArrayList<>();
    //     if (x == 4 || y == 4) {
    //         list.add(this);
    //     } else {
    //         list.addAll(this.nextX().goNext());
    //         list.addAll(this.nextY().goNext());
    //     }
    //     return list;
    // }

    Long goNext() {
        if (x==20 || y==20) {
            return 1L;
        } else {
            return this.nextX().goNext() + this.nextY().goNext();
        }
    }

    private Node nextX() {
        return new Node(x+1, y);
    }

    private Node nextY() {
        return new Node(x, y+1);
    }
}
