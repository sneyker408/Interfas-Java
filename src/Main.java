public class Main {
    public static void main(String[] args) {
        // Creamos objetos de Perro y Gato
        Animal perro = new Perro();
        Animal gato = new Gato();

        // Llamamos a los métodos
        perro.hacerSonido();
        perro.mover();

        gato.hacerSonido();
        gato.mover();
    }
}
