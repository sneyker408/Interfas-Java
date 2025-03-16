// La clase Perro implementa la interfaz Animal
public class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }

    @Override
    public void mover() {
        System.out.println("El perro corre.");
    }
}
