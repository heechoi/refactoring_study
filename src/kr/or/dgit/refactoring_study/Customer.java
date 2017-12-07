package kr.or.dgit.refactoring_study;

import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.refactoring_study.statement.HTMLStatement;
import kr.or.dgit.refactoring_study.statement.Statement;
import kr.or.dgit.refactoring_study.statement.StatementFactory;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return name;
	}
	
	public List<Rental> getRentals() {
		return rentals;
	}

	public String statement(int isText) {
		Statement stmt =  StatementFactory.getStatement(isText);
		return stmt.value(this);
	}	

/*	public String htmlStatement() {
		return new HTMLStatement().value(this);
	}*/
	public int getTotalFrequentRenterPoints() {
		int result=0;
		for(Rental rental:rentals) {
			result+=rental.getFrequentRenterPoint();
		}
		return result;
	}

	public double getTotalCharge() {
		double result = 0;
		for(Rental rental:rentals) {
			result +=rental.getCharge();
		}
		return result;
	}

}
