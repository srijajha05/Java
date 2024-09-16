import java.util.*;
/* 
public class graph{
    static class Edge{
        int source ;
        int destination;
        public Edge(int s, int d){
            this.source =s;
            this.destination = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    public static void main(String[] args) {
        int V =4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        for(int i=0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.print(e.destination+" ");
        } 
        
    }
}
*/

public class graph{
    static class Edge{
        int source ;
        int destination;
        int weight;
        public Edge(int s, int d,int w){
            this.source =s;
            this.destination = d;
            this.weight =w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));
        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }
    public static void main(String[] args) {
        int V =4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        for(int i=0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.destination+","+e.weight);
        } 
        
    }
}