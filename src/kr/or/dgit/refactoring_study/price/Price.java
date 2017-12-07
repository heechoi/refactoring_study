package kr.or.dgit.refactoring_study.price;

public abstract class Price {
	public abstract int getPriceCode();
	public abstract double getCharge(int aDaysRented);
	public int getFrequentRenterPoint(int daysRented) {
		return 1;
	};
}
