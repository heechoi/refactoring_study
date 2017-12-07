package kr.or.dgit.refactoring_study.price;

import kr.or.dgit.refactoring_study.Movie;

public class PriceFactory {

	public static Price getFactory(int priceCode) {
		Price price = null;
		
		switch(priceCode) {
		case Movie.REGULAR:
			price = new RegularPrice();
			break;
		case Movie.NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		case Movie.CHILRENS:
			price = new ChildrenPrice();
			break;
		default:
			throw new IllegalArgumentException("가격 코드가 잘못 됐습니다");
		}
		return price;
	}

}
