public abstract class Animal implements Speakable{ // implements  реализация интерфейса
    private String name;

    public abstract String feed();// Что ест

    public Animal(String name) { // Конструктор
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Animal name: %s\n", this.name))
                .append(String.format("Feed: %s\n", feed())) //Корм
                .append(String.format("Voice: %s\n", speak())); //Голос

        return res.toString();

    }
}
