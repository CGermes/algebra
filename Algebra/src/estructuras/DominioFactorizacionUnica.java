package estructuras;

import java.util.List;

public abstract class DominioFactorizacionUnica<A> extends AnilloConmutativoUnitario<A> {
	
	public abstract List<Pair<A, Integer>> factorize(A op1);
}
