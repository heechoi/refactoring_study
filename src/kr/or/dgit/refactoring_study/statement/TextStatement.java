package kr.or.dgit.refactoring_study.statement;

import java.util.List;

import kr.or.dgit.refactoring_study.Customer;
import kr.or.dgit.refactoring_study.Rental;

public class TextStatement extends Statement {
	
	protected String headerString(String customerName) {
		return String.format("%s 고객님의 대여기록%n", customerName);
	}
	
	protected String eachRentalString(Rental aEach) {
		return String.format("\t%s\t%s%n", aEach.getMovie().getTitle(),aEach.getCharge());
	}
	protected String footerString(Customer aCustomer) {
		return String.format("누적 대여료 : %s%n 적립 포인트 : %s",aCustomer.getTotalCharge(),aCustomer.getTotalFrequentRenterPoints());
	}
}
