import java.util.ArrayList;

public class Variable {
	private State from;
	private State to;
	private ArrayList<CaseIRule> rs;
	private ArrayList<MITMRules> mrs;

	public Variable(State from, State to) {
		this.from = from;
		this.to = to;
		this.rs = new ArrayList<CaseIRule>();
		this.mrs = new ArrayList<MITMRules>();
	}

	public void addCaseIRule(CaseIRule r) {
		rs.add(r);
	}
	
	public void addMITMRule(MITMRules r) {
		mrs.add(r);
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
	
	public ArrayList<MITMRules> getMITMRules() {
		return this.mrs;
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
	
	public void printMITMRules() {
		if(mrs.size() == 0)
			return;
		System.out.print("A_{" + from.getId() + to.getId() + "}\\rightarrow");
		int i;
		for(i = 0; i < mrs.size(); i++) {
			System.out.println("\\epsilon, \\\\");
		}
	}
}
