package estructuras;

public abstract class DominioEuclideo<A> extends DominioFactorizacionUnica<A> {

	public abstract Pair<A, A> divisionResto(A op1, A op2);

	public abstract int degree(A op1);

	public A mcd(A op1, A op2) {
		return null;
	}

}
