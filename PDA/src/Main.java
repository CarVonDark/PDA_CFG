
public class Main {
	public static void main(String args[]) {
		//test1(); //pass
		//test2(); //pass
		test3();
	}
	
	public static void test1() {
		//pass
		System.out.println("Test 1 Listing Variables Homework 1\n");
		PDA test1 = new PDA();
	
		State q1 = new State(1);
		State q2 = new State(2);
		State q3 = new State(3);
		State q4 = new State(4);
		State q5 = new State(5);
		
		test1.addState(q1);
		test1.addState(q2);
		test1.addState(q3);
		test1.addState(q4);
		test1.addState(q5);
		
		q1.addRoute(new Route(q2, q1, 'e', 'e', '$'));
		
		q2.addRoute(new Route(q2, q2, '0', 'e', '0'));
		q2.addRoute(new Route(q2, q2, '1', 'e', '1'));
		q2.addRoute(new Route(q3, q2, 'e', 'e', '#'));
		
		q3.addRoute(new Route(q4, q3, '0', '#', 'e'));

		q4.addRoute(new Route(q4, q4, '0', '0', 'e'));
		q4.addRoute(new Route(q4, q4, '1', '1', 'e'));
		q4.addRoute(new Route(q5, q4, 'e', 'e', '$'));
		
		test1.findAllVariables();
		test1.findAllCaseIRules();
		test1.findAllCaseIIRules();
		test1.findAllMITMRules();
		test1.printAllVariables();
		test1.printAllCaseIRules();
		System.out.println();
		test1.printAllCaseIIRules();
		test1.printAllMITMRules();
	}
	
	public static void test2() {
		//pass
		System.out.println("Test 2 Listing Variables Class Example\n");
		PDA test2 = new PDA();
	
		State q1 = new State(1);
		State q2 = new State(2);
		State q3 = new State(3);
		State q4 = new State(4);
		State q5 = new State(5);
		State q6 = new State(6);
		State q7 = new State(7);
		
		test2.addState(q1);
		test2.addState(q2);
		test2.addState(q3);
		test2.addState(q4);
		test2.addState(q5);
		test2.addState(q6);
		test2.addState(q7);
		
		q1.addRoute(new Route(q2, q1, 'e', 'e', '$'));
		
		q2.addRoute(new Route(q2, q2, 'a', 'e', 'a'));
		q2.addRoute(new Route(q3, q2, 'b', 'a', 'e'));
		
		q3.addRoute(new Route(q3, q3, 'b', 'a', 'e'));
		q3.addRoute(new Route(q4, q3, 'c', 'e', 'c'));

		q4.addRoute(new Route(q4, q4, 'c', 'e', 'c'));
		q4.addRoute(new Route(q5, q4, 'd', 'c', 'e'));
		
		q5.addRoute(new Route(q5, q5, 'd', 'c', 'e'));
		q5.addRoute(new Route(q6, q5, 'e', '$', 'e'));
		q5.addRoute(new Route(q7, q5, 'e', '#', 'e'));
		
		q7.addRoute(new Route(q2, q7, 'e', 'e', '#'));	

		test2.findAllVariables();
		test2.findAllCaseIRules();
		test2.findAllCaseIIRules();
		test2.findAllMITMRules();
		test2.printAllVariables();
		test2.printAllCaseIRules();
		System.out.println();
		test2.printAllCaseIIRules();
		test2.printAllMITMRules();
	}
	
	public static void test3() {
		System.out.println("Test 3 Listing Variables Homework 3\n");
		PDA test3 = new PDA();
	
		State q1 = new State(1);
		State q2 = new State(2);
		State q3 = new State(3);
		State q4 = new State(4);
		State q5 = new State(5);
		State q6 = new State(6);
		State q7 = new State(7);
		State q8 = new State(8);
		State q9 = new State(9);
		State q10 = new State(10);
		
		test3.addState(q1);
		test3.addState(q2);
		test3.addState(q3);
		test3.addState(q4);
		test3.addState(q5);
		test3.addState(q6);
		test3.addState(q7);
		test3.addState(q8);
		test3.addState(q9);
		test3.addState(q10);
		
		q1.addRoute(new Route(q2, q1, 'e', 'e', '$'));
		
		q2.addRoute(new Route(q3, q2, 'e', 'e', 'S'));
		
		q3.addRoute(new Route(q3, q3, 'a', 'a', 'e'));
		q3.addRoute(new Route(q3, q3, 'b', 'b', 'e'));
		q3.addRoute(new Route(q3, q3, 'e', 'T', 'e'));
		q3.addRoute(new Route(q4, q3, 'e', 'S', 'e'));
		q3.addRoute(new Route(q7, q3, 'e', 'T', 'e'));
		q3.addRoute(new Route(q9, q3, 'e', 'S', 'e'));
		q3.addRoute(new Route(q10, q3, 'e', '$', 'e'));

		q4.addRoute(new Route(q5, q4, 'e', 'e', 'b'));
		
		q5.addRoute(new Route(q6, q5, 'e', 'e', 'T'));
		
		q6.addRoute(new Route(q3, q6, 'e', 'e', 'a'));
		
		q7.addRoute(new Route(q8, q7, 'e', 'e', 'a'));

		q8.addRoute(new Route(q3, q8, 'e', 'e', 'T'));

		q9.addRoute(new Route(q3, q9, 'e', 'e', 'b'));

		test3.findAllVariables();
		test3.findAllCaseIRules();
		test3.findAllCaseIIRules();
		test3.findAllMITMRules();
		test3.printAllVariables();
		test3.printAllCaseIRules();
		test3.printAllCaseIIRules();
		test3.printAllMITMRules();
	}

}
