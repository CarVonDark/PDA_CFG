
public class CaseIIRule extends Rule{
	
	private Variable left;
	private Variable right;
	private char firstSymbol;
	private char lastSymbol;
	
	public CaseIIRule(Variable left, Variable right, char first, char last) {
		this.left = left;
		this.right = right;
		this.firstSymbol = first;
		this.lastSymbol = last;
	}
	
	public Variable getLeft() {
		return this.left;
	}
	
	public Variable getRight() {
		return this.right;
	}
	
	public char getFirstSymbol() {
		return this.firstSymbol;
	}
	
	public char getLastSymbol() {
		return this.lastSymbol;
	}
	
	public String toString() {
		String first = ""+firstSymbol;
		String last = ""+lastSymbol;
		if(firstSymbol == 'e')
			first = "\\epsilon ";
		if(lastSymbol == 'e')
			last = "\\epsilon ";
		return left.toString() + "\\rightarrow " + first + right.toString() + last+"\\\\";
	}
	
}
