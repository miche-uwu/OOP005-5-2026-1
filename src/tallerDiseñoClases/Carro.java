package tallerDiseñoClases;

class Carro {
    String marca, modelo, color;
    boolean encendido;
    int velocidad;

    // Constructor vacío
    public Carro() {}

    // Constructor sobrecargado
    public Carro(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.encendido = false;
        this.velocidad = 0;
    }

    public void encender() {
        encendido = true;
        System.out.println("Carro encendido");
    }

    public void acelerar(int v) {
        if (encendido) {
            velocidad += v;
            System.out.println("Velocidad: " + velocidad);
        } else {
            System.out.println("El carro está apagado");
        }
    }

    public void frenar() {
        velocidad = 0;
        System.out.println("Carro frenado");
    }
}