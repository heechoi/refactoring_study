package kr.or.dgit.refactoring_study.price;

import kr.or.dgit.refactoring_study.Movie;

public class ChildrenPrice extends Price {
	@Override
	public int getPriceCode() {
		return Movie.CHILRENS;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result =0;
		result+=1.5;
		if(aDaysRented>3)
			result +=(aDaysRented-3)*1.5;
		return result;
	}

}
