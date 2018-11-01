import java.util.Arrays;

public class GraphTester {

	public static void main(String[] args) {
		WDGraph graph = new WDGraph(9);
		
		graph.addEdge(0, 1, 3);
		graph.addEdge(0, 4, 2);
		graph.addEdge(4, 5, 4);
		graph.addEdge(1, 2, 1);
		graph.addEdge(2, 3, 1);
		graph.addEdge(1, 3, 2);
		graph.addEdge(5, 6, 2);
		graph.addEdge(7, 8, 2);
		graph.addEdge(3, 5, 2);
		graph.addEdge(5, 7, 1);

		
		if(graph.existsEdge(1, 3))
			System.out.println("Yes Virgina, there is an edge");
		else
			System.out.println("No Virgina, there is not an edge");
		
		System.out.println(graph.getEdgeWeight(1, 3));
		//System.out.println(graph.getEdgeWeight(1, 5));
		
		for(int i : graph.adjacentTo(4))
			System.out.print(i + " ");
		System.out.println();
		
		System.out.println(graph.BFSVisit(0));
		
		System.out.println(graph.numComponents());
		
		System.out.println(graph.existsPath(1, 3));

		System.out.println(graph.existsPath(1, 5));
		
		int[] paths = graph.singleSourceShortestPath(0);
		System.out.println(Arrays.toString(paths));
	}

	
}
