import java.util.ArrayList;
import java.util.PriorityQueue;

public class EDA {
    ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    PriorityQueue<Node> PQ = new PriorityQueue<>();
    ArrayList<Integer> visited = new ArrayList<>();
    int[] lastNode;
    int[] distances;
    int numVertecies;
    int start;
    int end;

    public EDA(int length){
        numVertecies = length;
        lastNode = new int[numVertecies];
        distances = new int[numVertecies];
        for(int i = 0; i < distances.length; i++)
            distances[i] = Integer.MAX_VALUE;

    }

    public void solve(ArrayList<ArrayList<Node>> g, int startNode, int endNode){
        this.graph = g;
        start = startNode;
        end = endNode;
        distances[start] = 0;
        lastNode[start] = 100;
        PQ.add(new Node(start, 0));

        while(PQ.size() !=0){
            //remove node from prioirty queue
            int currentNode = PQ.remove().node;

            if(currentNode == end){
                return;
            }

            //update neighbor costs from current node
            for(int i = 0; i < graph.get(currentNode).size(); i++){
                Node neighbor = graph.get(currentNode).get(i);

                //check if the node has already been visited
                if(!visited.contains(neighbor.node)){
                    //if the cost to neighbor is less than the previous distance of the node
                    if(neighbor.cost + distances[currentNode] < distances[neighbor.node]){
                        distances[neighbor.node] = neighbor.cost + distances[currentNode];
//                        neighbor.cost = distances[neighbor.node];
                        lastNode[neighbor.node] = currentNode;
                        PQ.add(neighbor); 
                    }

                }

                processMessage(neighbor, currentNode);
            }
            visited.add(currentNode);

        }

    }

    public void processMessage(Node destination, int start){
        System.out.println("Vertex " + destination.node + " processing from vertex: " + start);
        System.out.println("Edge Cost: " + destination.cost + " ms");
        System.out.println("Processed.");
    }

    public String solution(){
        String a = "The shortest path from " + start + " to " + end + " is: ";
        String path = "";
        int currentInt = end;
        while(currentInt != start){
            System.out.println("current Int: " + currentInt);
            System.out.println("start " + start);
            path = lastNode[currentInt] +" " + path;
            currentInt = lastNode[currentInt];

        }
        return a + path + end + " with a cost of " + distances[end];
    }

    public String allPaths(){
        String a = "";
        for(int i = 0; i < distances.length; i++){
            a =  a + "\n"+ start + " to " + i + " smallest cost: " + distances[i];
        }

        return a;
    }

}
