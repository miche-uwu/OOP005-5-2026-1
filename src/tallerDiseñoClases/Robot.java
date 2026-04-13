package tallerDiseñoClases;

class Robot {
    int energia;
    boolean activo;

    // Constructor vacío
    public Robot() {
        energia = 100;
        activo = false;
    }

    // Constructor sobrecargado
    public Robot(int energia) {
        this.energia = energia;
        this.activo = false;
    }

    public void encender() {
        if (energia > 0) {
            activo = true;
            System.out.println("Robot encendido");
        }
    }

    public void prepararCafe() {
        if (activo && energia >= 10) {
            energia -= 10;
            System.out.println("Preparando café");
        }
    }

    public void limpiar() {
        if (activo && energia >= 15) {
            energia -= 15;
            System.out.println("Limpiando");
        }
    }

    public void cocinar() {
        if (activo && energia >= 20) {
            energia -= 20;
            System.out.println("Cocinando");
        }
    }

    public void recargar() {
        energia = 100;
        System.out.println("Robot recargado");
    }

    public void mantenimiento() {
        System.out.println("Mantenimiento realizado");
    }
}