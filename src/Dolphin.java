public class Dolphin extends Mammal implements Swimable{ //Класс Дельфин наследуемый от млекопит с реализацией интерфейса Плавания

    public Dolphin(String name) { // Экземпляр класса через конструктор
        super(name);
    } 
    
    @Override
    public String speak() {
        return "Yyyyy";
    }
    
    @Override
    public  String feed() {
        return "fish";
    }

    @Override
    public int swimSpeed() {
        return 45;
    }
}
