import java.util.ArrayList;

// Ryan Sweitzer
// 11/2/2016
// example of weighted directed graph
public class WDGraph {

	// variables
	private double[][] graph;
	private static int size = 10;

	// overloaded constructor
	public WDGraph(int size){
		this.size = size;
		graph = new double[size][size];
	}

	// default constructor
	public WDGraph(){
		this(size);
	}

	// method to add edge to graph
	public void addEdge(int vi, int vj, double weight){
		if(!checkBounds(vi,vj))
			throw new IllegalArgumentException("incorrect vertex");
		if(weight < 0)
			throw new IllegalArgumentException("incorrect weight");
		graph[vi][vj] = weight;
	}
	
	// weight of 1 is assigned if weight is not given
	public void addEdge(int vi, int vj){
		addEdge(vi, vj, 1);
	}

	// This method will return true if there exists an edge from vi to vj (vertex i, vertex j)
	public boolean existsEdge(int vi, int vj){
		if(!checkBounds(vi,vj))
			throw new IllegalArgumentException("incorrect vertex");
		return graph[vi][vj] != 0.0;
	}

	private boolean checkBounds(int vi, int vj){
		return !(vi < 0 || vi > size-1 || vj < 0 || vj > size-1);
	}

	public double getEdgeWeight(int vi, int vj){
		if(existsEdge(vi,vj))
			return graph[vi][vj];
		throw new IllegalArgumentException("edge does not exist");
	}

	//returns the list of all the neighbors of vi
	public ArrayList<Integer> adjacentTo(int vi){
		//validate vi

		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 0; i < size; i++)
			if(graph[vi][i] != 0)
				list.add(i);
		return list;
	}

	// visit vertices 
	public ArrayList<Integer> BFSVisit(int vi){
		//validate input
		boolean[] visited = new boolean[size];
		Queue<Integer> que = new Queue<Integer>();
		int tempVertex;
		ArrayList<Integer> list = new ArrayList<>();

		visited[vi] = true;
		que.enqueue(vi);
		while(!que.isEmpty()){
			tempVertex = que.dequeue();
			list.add(tempVertex);
			for(int i : adjacentTo(tempVertex))
				if(!visited[i]){
					visited[i] = true;
					que.enqueue(i);
				}
		}
		return list;
	}

	// need to finish!!!!!
	public ArrayList<Integer> DFSVisit(int vi){
		return null;
	}

	//returns true if there is a path from vi to vj
	public boolean existsPath(int vi, int vj){
		return BFSVisit(vi).contains(vj);
	}

	public boolean isConnected(){
		return numComponents() == 1;
	}
	
	// returns number of components in a graph
	public int numComponents(){
		int count = 0;
		boolean[] visited = new boolean[size];

		int vertex;
		ArrayList<Integer> list;

		while(true){
			vertex = firstUnvisited(visited);
			if(vertex == -1)
				break;

			count++;
			list = BFSVisit(vertex);
			for(int i : list)
				visited[i] = true;
		}
		return count;
	}

	// returns the first unvisited vertex, return -1 if all visited
	private int firstUnvisited(boolean[] visited){
		for(int i = 0; i < visited.length; i++)
			if(!visited[i])
				return i;
		return -1;
	}

	// this method will use Dijkstra's shortest path algorithm to find the shortest path 
	// from source vi to all other vertices. The result will be placed in the array and returned
	public int[] singleSourceShortestPath(int vi){
		
		int[] paths = new int[size];
		boolean[] visited = new boolean[size];
		
		double[] distance = new double[size];
		
		for(int i = 0; i < size; i++)
			distance[i] = Double.POSITIVE_INFINITY;
		distance[vi] = 0.0;
		
		for(int i = 0; i < size; i++){
			int next = minVertex(distance, visited);
			visited[next] = true;
			
			ArrayList<Integer> n = adjacentTo(next);
			
			for(int j = 0; j < n.size(); j++){
				int v = n.get(j);// v = neighbor
				double d = distance[next] + graph[next][v];
				if(d < distance[v]){
					distance[v] = d;
					paths[v] = next;
				}
			}
		}
		return paths;
	}
	
	private static int minVertex(double[] dist, boolean[] visited){
		double x = Double.MAX_VALUE;
		int y = -1;
		for(int i = 0; i<dist.length; i++){
			if(!visited[i] && dist[i]<x){
				y = i;
				x = dist[i];
			}
		}
		return y;
	}
		
	

	//private double lestCostNeighbor(int vi, )
}
