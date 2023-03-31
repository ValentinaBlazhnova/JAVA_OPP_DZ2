public class Goat extends Herbivore implements Walkable{ //Класс коза
    public Goat(String name) { //Конструктор создаёт экземпляр класса
        super(name);
    }

    @Override
    public String speak() {
        return "Bee";
    }

    @Override
    public int runSpeed() {
        return 35;
    }
}
