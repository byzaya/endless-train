import java.util.ArrayList;

public class Human {
    private final Train train = new Train();
    private final ArrayList<Wagon> randomTrain = train.makeTrain();
    private final Wagon head = randomTrain.get(train.randPosition());

    //метод обхода по вагонам и подсчета их количества
    public void countWagons() {
        int count = 0;
        boolean finish = true;
        if (!head.value) { //если свет в вагоне выключен, то мы его включаем
            head.value = true;
        }
        Wagon currWagon = head; // переменная текущий вагон, для перемещения по поезду
        System.out.println("Количество вагонов в поезде: " + train.countOfWagons);
        do {
            currWagon = currWagon.nextWagon; // текущим вагоном становится следующий вагон
            count++;
            if (currWagon.value) { // если свет включен, выключаем его
                currWagon.value = false;
                for (int i = count; i > 0; i--) { // и идем в обратную сторону
                    currWagon = currWagon.previousWagon;
                }
                if (!currWagon.value) {
                    System.out.println("Количество вагонов, которое посчитал человек: " + count);
                    finish = false;
                } else {
                    count = 0;
                }
            }
        } while (finish); //делаем до тех пор, пока голова поезда не выключится
    }
}
