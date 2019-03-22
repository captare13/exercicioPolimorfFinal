package entities;

public class CompanyPayer extends Payer {

	private Integer numberOfEmployees;

	public CompanyPayer() {
		super();
	}

	public CompanyPayer(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double tax = 0;
		if (numberOfEmployees > 10) {
			tax = anualIncome * 0.14;
		} else {
			tax = anualIncome * 0.16;
		}
		return tax;
	}

}
