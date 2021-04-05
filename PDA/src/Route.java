
public class Route {
	private State to;
	private State from;
	private char read;
	private char pop;
	private char push;
	
	public Route(State to, State from, char read, char pop, char push) {
		this.to = to;
		this.from = from;
		this.read = read;
		this.pop = pop;
		this.push = push;
	}
	
	public State getTo() {
		return this.to;
	}
	
	public State getFrom() {
		return this.from;
	}
	
	public char getRead() {
		return this.read;
	}
	
	public char getPop() {
		return this.pop;
	}
	
	public char getPush() {
		return this.push;
	}
}
