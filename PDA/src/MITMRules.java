
public class MITMRules extends Rule{
	
	private Variable from;
	private final char epsilon = 'e';
	
	public MITMRules(Variable from) {
		this.from = from;
	}
	
	public Variable getFrom( ) {
		return this.from;
	}
	
	public char getEpislon() {
		return this.epsilon;
	}
}
