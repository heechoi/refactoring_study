package kr.or.dgit.refactoring_study;

import kr.or.dgit.refactoring_study.price.Price;
import kr.or.dgit.refactoring_study.price.PriceFactory;

public class Movie {
	public static final int REGULAR=0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILRENS = 2;
	
	private String title;
	private Price price;
	
	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		price = PriceFactory.getFactory(priceCode);
	}
	
	public double getCharge(int aDaysRented) {
		return price.getCharge(aDaysRented);
	}
	
	public int getFrequentRenterPoint(int daysRented) {
		return price.getFrequentRenterPoint(daysRented);
	
	}

}
