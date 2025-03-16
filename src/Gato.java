// La clase Gato implementa la interfaz Animal
public class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla: ¡Miau miau!");
    }

    @Override
    public void mover() {
        System.out.println("El gato salta.");
    }
}
