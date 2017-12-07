package kr.or.dgit.refactoring_study.statement;

public class StatementFactory {

	public static Statement getStatement(OutputKind isText) {
		Statement stmt = null;
		
		switch(isText) {
		case TEXT:
			stmt = TextStatement.getInstance();
			break;
		case HTML:
			stmt = HTMLStatement.getInstance();
			break;
		case XML:
			stmt = XmlStatement.getInstance();
			break;
		default:
			throw new IllegalArgumentException("출력 코드가 잘못됐습니다");
		}
		return stmt;
	}

}
