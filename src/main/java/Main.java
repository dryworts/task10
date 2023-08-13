import ru.netology.radio.Radio;

public class Main {
    public static void main(String[] args) {
        Radio myradio = new Radio();
        //ставлю на 5 программу
        myradio.setCurrentStation(5);
        //увеличиваю на один и ожидаю 6
        myradio.next();
        //уменьшаю на один и ожидаю 5
        myradio.prev();

        System.out.println("выбрана станция " + myradio.getCurrentStation());
        System.out.println("уровень громкости " + myradio.getCurrentVolume());
        myradio.increaseVolume();
        myradio.increaseVolume();
        System.out.println("уровень громкости " + myradio.getCurrentVolume());
        myradio.decreaseVolume();
        myradio.decreaseVolume();
        System.out.println("уровень громкости " + myradio.getCurrentVolume());
        myradio.decreaseVolume();
        System.out.println("уровень громкости " + myradio.getCurrentVolume());
        for (int i = 1; i <= 100; i++) {
            myradio.increaseVolume();
        }
        System.out.println("уровень громкости " + myradio.getCurrentVolume());
        myradio.increaseVolume();
        System.out.println("уровень громкости " + myradio.getCurrentVolume());

    }
}
