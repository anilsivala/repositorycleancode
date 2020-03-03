package Interest;

public class compoundInterest {
	double Principle, Time, RateOfInterest, TimesInterestApplied;

	public compoundInterest(double principle, double time, double rateOfInterest, double timesInterestApplied) {
		super();
		Principle = principle;
		Time = time;
		RateOfInterest = rateOfInterest/100;
		TimesInterestApplied = timesInterestApplied;
	}

	public double getPrinciple() {
		return Principle;
	}

	public double getTime() {
		return Time;
	}

	public double getRateOfInterest() {
		return RateOfInterest;
	}

	public double getTimesInterestApplied() {
		return TimesInterestApplied;
	}
	
	public double evaluateCompoundInterest() {
		return Principle*(Math.pow((1 + (RateOfInterest/TimesInterestApplied)),(TimesInterestApplied*Time)));
	}
}
