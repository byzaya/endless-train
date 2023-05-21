import java.util.ArrayList;
import java.util.Random;

public class Train {
    private final Random random = new Random();
    private Wagon head; // первый вагон
    private Wagon tail; // последний поезд
    public final int countOfWagons = random.nextInt(1, 100); //количество вагонов
    private final ArrayList<Wagon> train = new ArrayList<>(); //поезд

    //заполняем вагоны поезда включенным/выключенным светом
    public ArrayList<Wagon> makeTrain() {
        for (int i = 0; i < countOfWagons; i++) {
            train.add(addWagon(random.nextBoolean()));
        }
        return train;
    }

    //метод возвращающий позицию человека в поезде
    public int randPosition() {
        return random.nextInt(1, countOfWagons);
    }

    // метод для сцепления вагонов при добавлении нового
    private Wagon addWagon(boolean value) {
        Wagon newNode = new Wagon(value);
        if (train.size() == 0) {
            head = newNode;
        } else {
            newNode.nextWagon = head;
            newNode.previousWagon = tail;
            head.previousWagon = newNode;
            tail.nextWagon = newNode;
        }
        tail = newNode;
        return newNode;
    }
}
