import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Stack;

public class State {

	private int id;
	private ArrayList<Route> set;
	private ArrayList<Variable> vs = new ArrayList<Variable>();

	public State(int id) {
		this.id = id;
		set = new ArrayList<Route>();
	}

	public int getId() {
		return this.id;
	}

	public ArrayList<Route> getSet() {
		return this.set;
	}
	
	public ArrayList<Route> getRoutes() {
		return this.set;
	}

	public void addRoute(Route r) {
		this.set.add(r);
	}

	public void findVariables() {
		HashSet<State> visited = new HashSet<State>();
		Stack<State> States = new Stack<State>();
		States.push(this);
		while (!States.isEmpty()) {
			State current = States.pop();
			visited.add(current);
			for (Route r : current.set) {
				if (visited.contains(r.getTo())) {

				} else {
					States.push(r.getTo());
				}
			}
		}
		ArrayList<State> ans = new ArrayList<State>();
		for (State n : visited) {
			ans.add(n);
		}
		ans.sort(new Comparator<State>() {

			@Override
			public int compare(State o1, State o2) {
				return o1.id - o2.id;
			}
		});

		for (State n : ans)
			vs.add(new Variable(this, n));

	}

	public ArrayList<Variable> getVariables() {
		return vs;
	}
	
	public void printVariables() {
		int i;
		for(i = 0; i < vs.size()-1; i++) {
			System.out.print(vs.get(i) + ",");
		}
		System.out.print(vs.get(i));
	}
}
