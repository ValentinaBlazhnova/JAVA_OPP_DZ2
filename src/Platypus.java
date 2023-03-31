public class Platypus extends Mammal implements Walkable{ //implements  реализация интерфейса
    public Platypus(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Ttt";
    }

    @Override
    public String feed() {
        return "Fish, grass";
    }

    @Override
    public int runSpeed() {
        return 6;
    }
}
