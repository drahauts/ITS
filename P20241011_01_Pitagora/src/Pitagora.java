public class Pitagora {
	public static void main(String[] args) {
		double Cateto1 = 45.3;
		double Cateto2 = 67.2;
		
		// Hypotenusa
		double hypotenusa = Math.sqrt(Cateto1 * Cateto1 + Cateto2 * Cateto2);
		
		double area = Cateto1 * Cateto2 / 2;
		
		double perimetro = Cateto1 - Cateto2 + hypotenusa;
		
		double raggio = hypotenusa * 3/4;
		
		double circonferenza = 2 * raggio * Math.PI;
		
		double area_cerchio = Math.PI * Math.pow(raggio, 2);
		
		TriangoloRettangolo tr = new TriangoloRettangolo(3, 4);
		
		System.out.println("hypotenusa: " + tr.getHyp());
		System.out.println("Area: " + tr.getArea());
		
		tr.setCat1(6);
		System.out.println("hypotenusa: " + tr.getHyp());
		System.out.println("Area: " + tr.getArea());
		
		TriangoloRettangolo tr1 = new TriangoloRettangolo(900, 0.2);
		tr1.setCat2(10);
		tr1.setCat1(10);
		System.out.println("Hypotenusa: " + tr1.getHyp());
	}
}