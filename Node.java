public class Node implements Comparable<Node>{
    public int node;
    //initially the edge value, but will be reassigned to total cost from source
    public int cost;
    public int lastNode;

    public Node(int node, int edgeCost){
        this.node = node;
        this.cost = edgeCost;
    }

    //compares total cost for priority queue
    public int compareTo(Node o) {
        if(cost < o.cost)
            return -1;
        if(cost > o.cost)
            return 1;
        return 0;
    }

    public String toString(){
        return "" + node;
    }

}
