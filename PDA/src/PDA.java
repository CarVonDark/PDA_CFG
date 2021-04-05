import java.util.ArrayList;

public class PDA {
	private ArrayList<State> states;
	private ArrayList<Variable> vs;

	public PDA() {
		states = new ArrayList<State>();
		vs = new ArrayList<Variable>();
	}

	public void addState(State s) {
		states.add(s);
	}

	public void findAllVariables() {
		for (State s : states) {
			s.findVariables();
			vs.addAll(s.getVariables());
		}
	}
	
	public boolean verifyCaseI(Variable v1, Variable v2, Variable v3) {
		if(v1.getFrom().equals(v2.getFrom()) && v2.getTo().equals(v3.getFrom()) && v1.getTo().equals(v3.getTo())) {
			return true;
		} else {
			return false;
		}
	}
	
	public void findAllCaseIRules() {
		for(Variable v1: vs) {
			for(Variable v2 : vs) {
				for(Variable v3 : vs) {
					if(verifyCaseI(v1, v2, v3))
						v1.addRule(new CaseIRule(v1, v2, v3));
				}
			}
		}
	}

	public ArrayList<Variable> getVariables() {
		return this.vs;
	}

	public void printAllCaseIRules() {
		for(Variable v: vs) {
			v.printCaseIRules();
		}
	}
	
	public void printAllVariables() {
		int i;
		for(i = 0; i < states.size()-1; i++) {
			states.get(i).printVariables();
			System.out.println(",\\\\");
		}
		states.get(i).printVariables();		
		System.out.println("\n");
	}
}
