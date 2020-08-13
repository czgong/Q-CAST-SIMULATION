import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        GraphGenerator g = new GraphGenerator();
        ArrayList<ArrayList<Node>> myGraph = g.generate();
        EDA solver = new EDA(myGraph.size());

        System.out.println("");
        for(ArrayList<Node> neighbors : myGraph){
            for( Node n : neighbors){
                System.out.print(n.node + " ");
            }
            System.out.println();
        }

            solver.solve(myGraph, g.source, g.destination);
            System.out.print(solver.solution());
            System.out.print(solver.allPaths());

            
//            g.source = (int)(Math.random() * myGraph.size());
//            g.destination = (int)(Math.random() * myGraph.size());

//            failEntanglement(myGraph);
//        int node = (int)(Math.random() * myGraph.size());
//        int size = myGraph.get(node).size();
//        int neighbor = (int)(Math.random() * size);
//
//        System.out.println("VERTEX REMOVED: " + myGraph.get(node).remove(neighbor));
//
//        solver.solve(myGraph, 0, 3);
//        System.out.print(solver.solution());
//        System.out.print(solver.allPaths());
//        g.source = (int)(Math.random() * myGraph.size());
//        g.destination = (int)(Math.random() * myGraph.size());





    }

//    public static void failEntanglement(ArrayList<ArrayList<Node>> g){
//        int node = (int)(Math.random() * g.size());
//        int size = g.get(node).size();
//        int neighbor = (int)(Math.random() * size);
//
//        System.out.println("VERTEX REMOVED: " + g.get(node).remove(neighbor));
//
//    }
}
