
public class WGraph extends WDGraph {

	// constructor
	public WGraph() {
		super();
	}
	// OL constructor
	public WGraph(int size) {
		super(size);
	}
	
	public void addEdge(int vi, int vj, double weight){
		super.addEdge(vi, vj, weight);
		super.addEdge(vj, vi, weight);
	}
	// weight of 1 is assigned if weight is not supplied
	public void addEdge(int vi, int vj){
		addEdge(vi, vj, 1);
	}
}
