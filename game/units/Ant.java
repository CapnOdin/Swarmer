package game.units;

import aco.ai.AntBrain;
import aco.graph.Node;
import aco.graph.Vector2;
import game.Player;

public class Ant {
	
	private float x;
	private float y;
	private float food;

	private AntBrain brain;

	private Vector2 desiredPosition;

	public Ant(Player owner, Node startNode) {

		brain = new AntBrain(owner, startNode);

		food = 200;
		desiredPosition = startNode.getPosition();
	}

	public void update(float delta) {
		if (food <= 0) {
			return;
		}
		
		desiredPosition = brain.determineNextPath().getNode().getPosition();
		food -= 1;
		
		System.out.println(desiredPosition);
	}
}
