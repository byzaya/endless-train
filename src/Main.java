
public class Main {
    /*
     Если свет в начальном вагоне выключен, мы должны включить его и выбрать произвольное направление движения,
     считая количество пройденных вагонов, пока не найдем освещенный.
     Затем выключаем свет, возвращаемся к начальному вагону и проверяем, горит ли свет в нем.
     Если да, повторяем процесс. Если нет, значит мы прошли полный круг и получили ответ.
    */
    public static void main(String[] args) {
        Human human = new Human();
        human.countWagons();
    }
}
