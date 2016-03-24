package practica.services;

import practica.model.Circle;
import practica.model.Triangle;

public class ShapeService {
	
	private Circle circulo;
	private Triangle triangulo;
	
	public Circle getCirculo() {
		return circulo;
	}
	public void setCirculo(Circle circulo) {
		this.circulo = circulo;
	}
	public Triangle getTriangulo() {
		return triangulo;
	}
	public void setTriangulo(Triangle triangulo) {
		this.triangulo = triangulo;
	}
	
}
