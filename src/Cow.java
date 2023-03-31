public class Cow extends Herbivore implements Walkable{ //implements  реализация интерфейса
    public Cow(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Myy";
    }

    @Override
    public int runSpeed() {
        return 20;
    }
}
