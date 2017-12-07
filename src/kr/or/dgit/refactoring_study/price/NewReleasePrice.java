package kr.or.dgit.refactoring_study.price;

public class NewReleasePrice extends Price {
	private static final NewReleasePrice instance = new NewReleasePrice();
	
	private NewReleasePrice() {}

	
	public static NewReleasePrice getInstance() {
		return instance;
	}


	@Override
	public MovieKind getPriceCode() {
		return MovieKind.NEW_RELEASE;
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
