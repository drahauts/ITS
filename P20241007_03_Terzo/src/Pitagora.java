public class Pitagora {
    public static void main(String[] args){
        double c1 = 45.3;
        double c2 =  67.2;

        // teorema Pitagora
        double hypotenusa = Math.sqrt(c1 * c1 + c2 * c2);
        System.out.printf("La lunghezza dell'ipotenusa è: %.2f metri\n", hypotenusa);

        // Area del triangolo: calcolata come 1/2 x cateto1 x cateto2
        double area = 0.5 * c1 * c2;
        System.out.println("L'area è: " + area);

        // 3) calcolare e stampare il suo perimetro
        double perimetro = hypotenusa + c1 + c2;
        System.out.printf("Il perimetro è: %.2f metri\n", perimetro);
    
        // Calcolo del raggio del cerchio
        double raggio_cerchio = 3.0 / 4.0 * hypotenusa;
        System.out.printf("Il raggio del cerchio è: %.2f \n", raggio_cerchio);

        // Calcolo della circonferenza del cerchio
        double circonferenza = 2 * raggio_cerchio * Math.PI;
        System.out.printf("La circonferenza del cerchio è: %.2f \n", circonferenza);

        // Area del cercio
        double area_cerchio = Math.PI * raggio_cerchio * raggio_cerchio;
        System.out.printf("L'area del cerchio è: %.2f \n", area_cerchio);
    }
}