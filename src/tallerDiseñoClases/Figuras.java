package tallerDiseñoClases;

class Figuras {

    // Constructor vacío
    public Figuras() {}

    // Constructor sobrecargado
    public Figuras(String tipo) {
        System.out.println("Calculando área de: " + tipo);
    }

    // Cuadrado
    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    // Triángulo
    public double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Pentágono regular
    public double areaPentagono(double perimetro, double apotema) {
        return (perimetro * apotema) / 2;
    }

    // Irregulares (ejemplo)
    public double areaTrapecio(double B, double b, double h) {
        return ((B + b) * h) / 2;
    }

    public double areaRombo(double D, double d) {
        return (D * d) / 2;
    }

    public double areaPoligonoIrregular(double perimetro, double apotema) {
        return (perimetro * apotema) / 2;
    }

    // Círculo
    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
}