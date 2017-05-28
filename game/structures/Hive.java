package game.structures;

import aco.graph.Node;
import aco.graph.Vector2;
import game.Player;

public class Hive extends Structure {

	private final Player owner;
	private Node node;

	public Hive(Player owner, Node node) {
		this.owner = owner;
		this.node = node;
		node.setHome(owner);

		Vector2 position = node.getPosition();
	}
}
