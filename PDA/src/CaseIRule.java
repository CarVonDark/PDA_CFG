
public class CaseIRule extends Rule{

	private Variable left;
	private Variable right1;
	private Variable right2;
	
	public CaseIRule(Variable left, Variable right1, Variable right2) {
		this.left = left;
		this.right1 = right1;
		this.right2 = right2;
	}
	
	public Variable getLeft() {
		return this.left;
	}
	
	public Variable getRight1() {
		return this.right1;
	}
	
	public Variable getRight2() {
		return this.right2;
	}
}
