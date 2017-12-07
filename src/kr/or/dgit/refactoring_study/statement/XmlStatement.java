package kr.or.dgit.refactoring_study.statement;

import kr.or.dgit.refactoring_study.Customer;
import kr.or.dgit.refactoring_study.Rental;

public class XmlStatement extends Statement {
	private static final XmlStatement instance = new XmlStatement();
	
	private XmlStatement() {}

	public static XmlStatement getInstance() {
		return instance;
	}
	@Override
	protected String headerString(String customerName) {
		return String.format("<customer 고객명 ='%s'>%n", customerName);
	}

	@Override
	protected String eachRentalString(Rental aEach) {
		return String.format("\t<movie title = '%s'>%s,</movie>%n", aEach.getMovie().getTitle(),aEach.getCharge());
	}

	@Override
	protected String footerString(Customer aCustomer) {
		return String.format("\t<누적 대여료>%s</누적대여료>%n \t<적립포인트>%s</적립포인트 ></customer>", aCustomer.getTotalCharge(),aCustomer.getTotalFrequentRenterPoints());
	}

}
