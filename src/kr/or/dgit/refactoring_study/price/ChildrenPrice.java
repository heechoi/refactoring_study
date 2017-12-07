package kr.or.dgit.refactoring_study.price;

public class ChildrenPrice extends Price {
	private static final ChildrenPrice instance = new ChildrenPrice();
	
	private ChildrenPrice() {}
	
	public static ChildrenPrice getInstance() {
		return instance;
	}

	@Override
	public MovieKind getPriceCode() {
		return MovieKind.CHILRENS;
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
