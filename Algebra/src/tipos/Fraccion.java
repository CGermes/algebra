package tipos;

public class Fraccion<A> {
	private final A dividendo;
	private final A divisor;
	
	public Fraccion(A dividendo, A divisor) {
		super();
		this.dividendo = dividendo;
		this.divisor = divisor;
	}

	public A getDividendo() {
		return dividendo;
	}

	public A getDivisor() {
		return divisor;
	}

	
}
