
public class Wagon {
    boolean value; //значение света внутри вагона
    Wagon nextWagon; // следующий вагон
    Wagon previousWagon; // предыдущий вагон

    public Wagon(boolean value) {
        this.value = value;
        this.nextWagon = this;
        this.previousWagon = this;
    }
}
