package kr.or.dgit.refactoring_study;

import kr.or.dgit.refactoring_study.price.MovieKind;
import kr.or.dgit.refactoring_study.statement.OutputKind;

public class Main {

	public static void main(String[] args) {
		
		//Movie 액션물을 추가 대여기간 2일까지 $4,이후 초과 일수에 따라 $2추가
		//대여현황을 xml로 출력되는 기능을 추가 하시오.
		
		Movie mc1 = new Movie("니모를 찾아서", MovieKind.CHILRENS);
		Movie mc2 = new Movie("말레피센트", MovieKind.CHILRENS);
		Movie mr1 = new Movie("명량", MovieKind.REGULAR);
		Movie mr2 = new Movie("변호사", MovieKind.REGULAR);
		Movie mn1 = new Movie("곡성", MovieKind.NEW_RELEASE);
		Movie mn2 = new Movie("인디펜던스데이", MovieKind.NEW_RELEASE);
		Movie ma1 = new Movie("나잡아봐", MovieKind.ACTION);
		
		Rental r1 = new Rental(mc1, 3);
		Rental r2 = new Rental(mc2, 4);
		Rental r3 = new Rental(mr1, 2);
		Rental r4 = new Rental(mr2, 3);
		Rental r5 = new Rental(mn1, 2);
		Rental r6 = new Rental(mn2, 3);
		Rental r7 = new Rental(ma1, 2);
		
		Customer c = new Customer("김주하");
		c.addRental(r1);
		c.addRental(r3);
		c.addRental(r5);
		c.addRental(r7);
		
		Customer c1 = new Customer("김희영");
		c1.addRental(r2);
		c1.addRental(r4);
		c1.addRental(r6);
		
		System.out.println(c.statement(OutputKind.TEXT));
		System.out.println();
		System.out.println(c1.statement(OutputKind.TEXT));
		System.out.println();
		System.out.println("==================html===============");
		System.out.println(c.statement(OutputKind.HTML));
		System.out.println();
		System.out.println(c1.statement(OutputKind.HTML));
		System.out.println();
		System.out.println("==================Xml===============");
		System.out.println(c.statement(OutputKind.XML));
		System.out.println();
		System.out.println(c1.statement(OutputKind.XML));
	}

}
