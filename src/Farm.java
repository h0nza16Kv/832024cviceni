import java.lang.reflect.Array;
import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> zviratka = new ArrayList<>();
    ArrayList<Flower> rostlinky = new ArrayList<>();

    public void addAnimal(Animal animal) throws Exception {
        if (zviratka.size() <= 20) {
            zviratka.add(animal);
        } else {
            throw new Exception("Maximalni pocet zvirat. Nemuzes pridavat dalsi");
        }
    }

    public void removeAnimal(int index) throws Exception {
        if (index > 0) {
            throw new Exception();
        } else {
            zviratka.remove(index);
        }
    }

    public void addFlower(Flower flower) throws Exception {
            if (rostlinky.size() <= 5) {
                rostlinky.add(flower);
            } else {
                throw new Exception("Maximalni pocet rosltin. Nemuzes pridavat dalsi");
            }
        }

        public void removeFlower(int index) throws Exception {
        if (index > 0) {
            throw new Exception();
        } else {
            rostlinky.remove(index);
        }
    }



}
