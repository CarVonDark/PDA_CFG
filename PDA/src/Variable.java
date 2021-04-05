import java.util.ArrayList;

public class Variable {
	private State from;
	private State to;
	private ArrayList<CaseIRule> rs;

	public Variable(State from, State to) {
		this.from = from;
		this.to = to;
		this.rs = new ArrayList<CaseIRule>();
	}

	public void addRule(CaseIRule r) {
		rs.add(r);
	}

	public ArrayList<CaseIRule> getRules() {
		return this.rs;
	}
	
	public State getFrom() {
		return this.from;
	}
	
	public State getTo() {
		return this.to;
	}

	public String toString() {
		return "A_{" + from.getId() + to.getId()+"}";
	}
	
	public ArrayList<CaseIRule> getCaseIRules() {
		return this.rs;
	}
	
	public void printCaseIRules() {
		System.out.print("A_{" + from.getId() + to.getId() + "}\\rightarrow");
		int i;
		for(i = 0; i < rs.size()-1; i++) {
			CaseIRule r = rs.get(i);
			Variable right1 = r.getRight1();
			Variable right2 = r.getRight2();
			System.out.print(" A_{"+right1.from.getId()+right1.getTo().getId()+"}A_{"+right2.getFrom().getId()+right2.getTo().getId()+"} \\mid");
		}
		CaseIRule r = rs.get(i);
		Variable right1 = r.getRight1();
		Variable right2 = r.getRight2();
		System.out.println(" A_{"+right1.from.getId()+right1.getTo().getId()+"}A_{"+right2.getFrom().getId()+right2.getTo().getId()+"},\\\\");
	}
}
