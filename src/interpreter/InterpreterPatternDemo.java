package interpreter;

public class InterpreterPatternDemo {

	//����Robert ��John������
	public static Expression getMaleExpression() {
		
		Expression 	robert=new TerminalExpression("Robert");
		Expression john=new TerminalExpression("John");
		return new OrExpression(robert, john);
	}
	//����Julie ��һ���ѻ��Ů��
	public static Expression getMarriedWomanExpression() {
		Expression 	juile=new TerminalExpression("Juile");
		Expression married =new TerminalExpression("Married ");
		return new OrExpression(juile, married);
	}
	public static void main(String[] args) {
		Expression isMale=getMaleExpression();
		Expression isMarriedWoman=getMarriedWomanExpression();
		System.out.println("John is male?"+isMale.interpret("John"));
		System.out.println("Julie is a married women? " 
			      + isMarriedWoman.interpret("Married Julie"));
	}
}
