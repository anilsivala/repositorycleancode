package Interest;

public class simpleInterest {
	double Principle, Time, RateOfInterest;
	public simpleInterest(double Priciple, double Time, double RateOfInterest) {
		this.Principle = Priciple;
		this.Time = Time;
		this.RateOfInterest = RateOfInterest/100;
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
	
	public double evaluateSimpleInterest() {
		return ( ( this.Principle * this.Time * this.RateOfInterest ) / 100);
	}

}
