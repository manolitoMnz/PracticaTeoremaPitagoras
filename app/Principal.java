package app;
import clases.TrianguloRectangulo;
public class Principal {

	public static void main(String[] args) {
		TrianguloRectangulo normal = new TrianguloRectangulo(3,2);
		TrianguloRectangulo basico = new TrianguloRectangulo();
		
		normal.area();
		basico.area();
		
		normal.hipotenusa();
		basico.hipotenusa();
		
		normal.perimetro();
		basico.perimetro();

		
		
		
		
		
		
	}

}
