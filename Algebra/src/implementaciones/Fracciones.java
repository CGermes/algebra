package implementaciones;

import estructuras.Cuerpo;
import estructuras.DominioEuclideo;
import tipos.Fraccion;

public class Fracciones<A> extends Cuerpo<Fraccion<A>> {

	private DominioEuclideo<A> operador;

	public Fracciones(DominioEuclideo<A> operador) {
		super();
		this.operador = operador;
	}

	@Override
	public Fraccion<A> addition(Fraccion<A> op1, Fraccion<A> op2) {
		A a = op1.getDividendo();
		A b = op1.getDivisor();
		A c = op2.getDividendo();
		A d = op2.getDivisor();
		return new Fraccion<A>( operador.addition(operador.product(a, d), operador.product(c, b)) , operador.product(b, d) ) ;
	}

	@Override
	public Fraccion<A> difference(Fraccion<A> op1, Fraccion<A> op2) {
		A a = op1.getDividendo();
		A b = op1.getDivisor();
		A c = op2.getDividendo();
		A d = op2.getDivisor();
		return new Fraccion<A>( operador.difference(operador.product(a, d), operador.product(c, b)) , operador.product(b, d) ) ;
	}
	
	@Override
	public Fraccion<A> product(Fraccion<A> op1, Fraccion<A> op2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fraccion<A> getZero() {
		return new Fraccion<A>(operador.getZero(), operador.getOne());
	}

	@Override
	public boolean iguales(Fraccion<A> op1, Fraccion<A> op2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fraccion<A> division(Fraccion<A> op1, Fraccion<A> op2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fraccion<A> getOne() {
		return new Fraccion<A>(operador.getOne(), operador.getOne());
	}

	private Fraccion<A> reducir(Fraccion<A> op){
		
		return op;
	}

}
