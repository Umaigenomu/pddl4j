package fr.uga.pddl4j.heuristics.relaxation;

import fr.uga.pddl4j.encoding.CodedProblem;
import fr.uga.pddl4j.planners.statespace.search.strategy.Node;
import fr.uga.pddl4j.util.BitExp;
import fr.uga.pddl4j.util.BitState;

public class AlwaysOne extends AbstractHeuristic {

	protected AlwaysOne(CodedProblem problem) {
		super(problem);
		super.setAdmissible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int estimate(BitState state, BitExp goal) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double estimate(Node node, BitExp goal) {
		// TODO Auto-generated method stub
		return 1;
	}

}
