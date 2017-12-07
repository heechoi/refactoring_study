package kr.or.dgit.refactoring_study.price;

import kr.or.dgit.refactoring_study.Movie;

public class NewReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result=0;
		result+=aDaysRented*3;
		return result;
	}

	@Override
	public int getFrequentRenterPoint(int daysRented) {
		return daysRented >1? 2:1;
	}
	
}
