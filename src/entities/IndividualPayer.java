package entities;

public class IndividualPayer extends Payer {

	private Double healthExpenditures;

	public IndividualPayer() {
		super();
	}

	public IndividualPayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double tax = 0;
		if (anualIncome < 20000 && healthExpenditures == 0) {
			tax = anualIncome * 0.15;
		}
		if (anualIncome < 20000 && healthExpenditures != 0) {
			tax = anualIncome * 0.15 - (healthExpenditures * 0.5);
		}
		if (anualIncome >= 20000 && healthExpenditures == 0) {
			tax = anualIncome * 0.25;
		}
		if (anualIncome >= 20000 && healthExpenditures != 0) {
			tax = anualIncome * 0.25 - (healthExpenditures * 0.5);
		}
		return tax;
	}

}
