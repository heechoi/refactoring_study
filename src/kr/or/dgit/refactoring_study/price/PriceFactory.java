package kr.or.dgit.refactoring_study.price;

public class PriceFactory {	
	
	public static Price getFactory(MovieKind priceCode) {
		Price price = null;
		
		switch(priceCode) {
		case REGULAR:
			price = RegularPrice.getInstance();
			break;
		case NEW_RELEASE:
			price =  NewReleasePrice.getInstance();
			break;
		case CHILRENS:
			price = ChildrenPrice.getInstance();
			break;
		case ACTION:
			price = ActionPrice.getInstance();
			break;
		default:
			throw new IllegalArgumentException("가격 코드가 잘못 됐습니다");
		}
		return price;
	}

}
