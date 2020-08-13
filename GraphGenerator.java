import java.util.ArrayList;

public class GraphGenerator {
    int source;
    int destination;
    int vertecies;
    int edges;
    public GraphGenerator(){

    }

    public ArrayList<ArrayList<Node>> generate(){
        ArrayList<ArrayList<Node>> myGraph = new ArrayList<ArrayList<Node>>();
        vertecies = (int)(Math.random() *10 + 5);
        source = (int)(Math.random() * vertecies);
        destination = (int)(Math.random() * vertecies);
        while(destination == source){
            destination = (int)(Math.random() * vertecies);
        }
        edges = (vertecies - 1) + (int)(Math.random() * 10) + 3;


        //initialize graph
        for(int i = 0; i < vertecies; i++){
            ArrayList<Node> listOfNeighbors = new ArrayList<>();
            myGraph.add(listOfNeighbors);
        }

        //standard one connection for each node in graph
        for(int g = 0; g < myGraph.size() - 1; g++){
            int randNode = (int)(Math.random() * vertecies);
            int cost = (int)(Math.random() * 10) + 1;
            while (randNode == g) {
                randNode = (int)(Math.random() * vertecies);
            }
            myGraph.get(g).add(new Node(randNode, cost));
            myGraph.get(randNode).add(new Node(g, cost));
        }

        edges = edges - myGraph.size() - 1;

        //other connections for graph
        for(int i = 0; i < edges; i++){
            int randNode = (int)(Math.random() * vertecies);
            int endNode = (int)(Math.random() * vertecies);
            while (randNode == endNode) {
                randNode = (int)(Math.random() * vertecies);
            }
            int cost = (int)(Math.random() * 10) + 1;
            while(isIncluded(endNode, randNode, myGraph)) {
                endNode = (int)(Math.random() * vertecies);
            }
            myGraph.get(randNode).add(new Node(endNode, cost));
            myGraph.get(endNode).add(new Node(randNode, cost));
        }

        return myGraph;
    }

    public boolean isIncluded(int num, int start, ArrayList<ArrayList<Node>> g){
            for (int j = 0; j < g.get(start).size(); j++)
                if (g.get(start).get(j).node == num)
                    return true;
        return false;

    }

}

