package estructuras;

public abstract class AnilloConmutativoUnitario<A> {

	public abstract A addition(A op1, A op2);
	
	public abstract A difference(A op1, A op2);

	public abstract A product(A op1, A op2);

	public abstract A getZero();

	public abstract A getOne();

	public abstract boolean iguales(A op1, A op2);
	
	public A potencia(A op1, int n){
		A result = getOne();
		for (int i=0; i<n; i++)
			result = product(result, op1);
		return result;
	}
	
	public A multiplicacion(A op1, int n){
		A result = getZero();
		for (int i=0; i<n; i++)
			result = addition(result, op1);
		return result;
	}
}
