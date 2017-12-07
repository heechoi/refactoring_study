package kr.or.dgit.refactoring_study.statement;

public class StatementFactory {

	public static Statement getStatement(int isText) {
		Statement stmt = null;
		
		switch(isText) {
		case Statement.TEXT:
			stmt = new TextStatement();
			break;
		case Statement.HTML:
			stmt = new HTMLStatement();
			break;
		default:
			throw new IllegalArgumentException("출력 코드가 잘못됐습니다");
		}
		return stmt;
	}

}
