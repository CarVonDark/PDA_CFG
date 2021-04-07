import java.util.ArrayList;

public class PDA {
	private ArrayList<State> states;
	private ArrayList<Variable> vs;
	private ArrayList<CaseIIRule> rs;
	private ArrayList<Route> routes;

	public PDA() {
		states = new ArrayList<State>();
		vs = new ArrayList<Variable>();
		rs = new ArrayList<CaseIIRule>();
		routes = new ArrayList<Route>();
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
		if (v1.getFrom().equals(v2.getFrom()) && v2.getTo().equals(v3.getFrom()) && v1.getTo().equals(v3.getTo())) {
			return true;
		} else {
			return false;
		}
	}

	public int findAllCaseIRules() {
		int sum = 0;
		for (Variable v1 : vs) {
			for (Variable v2 : vs) {
				for (Variable v3 : vs) {
					if (verifyCaseI(v1, v2, v3)) {
						v1.addCaseIRule(new CaseIRule(v1, v2, v3));
						sum++;
					}
				}
			}
		}
		return sum;
	}

	public void findAllCaseIIRules() {
		// Get all routes
		for (State s : states) {
			routes.addAll(s.getRoutes());
		}
		for (Route r1 : routes) {
			for (Route r2 : routes) {
				if (r1.getPush() != 'e' && r1.getPush() == r2.getPop()) {
					rs.add(new CaseIIRule(new Variable(r1.getFrom(), r2.getTo()),
							new Variable(r1.getTo(), r2.getFrom()), r1.getRead(), r2.getRead()));
				}
			}
		}
	}

	public void findAllMITMRules() {
		for (Variable v : vs) {
			if (v.getFrom().equals(v.getTo())) {
				v.addMITMRule(new MITMRules(v));
			}

		}
	}

	public ArrayList<Variable> getVariables() {
		return this.vs;
	}

	public void printAllCaseIRules() {
		for (Variable v : vs) {
			v.printCaseIRules();
		}
	}

	public void printAllCaseIIRules() {
		for (CaseIIRule r : rs) {
			System.out.println(r);
		}
	}

	public void printAllMITMRules() {
		for (Variable v : vs) {
			v.printMITMRules();
		}
	}

	public void printAllVariables() {
		int i;
		for (i = 0; i < states.size() - 1; i++) {
			states.get(i).printVariables();
			System.out.println(",\\\\");
		}
		states.get(i).printVariables();
		System.out.println("\n");
	}
}
