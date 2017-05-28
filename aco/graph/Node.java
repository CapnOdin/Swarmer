package aco.graph;

import java.util.ArrayList;

import game.Player;
import game.resources.Resource;

public class Node {

	private boolean isHome = false;
	private Player owner;

	private final Vector2 position;
	private ArrayList<Edge> connectedEdges;
	
	private Resource resource = null;
	
	public Node(Vector2 position) {
		this.position = position;
		connectedEdges = new ArrayList<>();
	}
	
	public Node(Vector2 position, ArrayList<Edge> connectedEdges) {
		this.position = position;
		this.connectedEdges = connectedEdges;
	}
	
	public Vector2 getPosition() {
		return position;
	}
	
	public void addEdge(aco.graph.Edge e) {
		connectedEdges.add(e);
	}

	public Boolean isHome(Player player) {
		return isHome && owner.equals(player);
	}

	public void setHome(Player owner) {
		this.isHome = true;
		this.owner = owner;
	}
	
	public Boolean hasResource() {
		return resource != null;
	}
	
	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public ArrayList<aco.graph.Edge> getConnectedEdges() {
		return connectedEdges;
	}

	public void setConnectedEdges(ArrayList<aco.graph.Edge> connectedEdges) {
		this.connectedEdges = connectedEdges;
	}
	
	public float getX() {
		return position.x;
	}
	
	public float getY() {
		return position.y;
	}

	@Override public boolean equals(Object node) {
		return position.equals(((Node) node).getPosition());
	}

}
