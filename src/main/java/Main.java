import ru.netology.radio.Radio;

public class Main {
    public static void main(String[] args) {
        //создаю радио из 20 станций
        Radio myradio = new Radio(20);
        //какую станцию покажет
        System.out.println("выбрана станция " + myradio.getCurrentStation());
        //ставлю на 20 программу
        myradio.setCurrentStation(20);
        System.out.println("выбрана станция " + myradio.getCurrentStation());
        //ставлю 1 программу
        myradio.setCurrentStation(1);
        System.out.println("выбрана станция " + myradio.getCurrentStation());
        //увеличиваю на один и ожидаю 1
        myradio.next();
        System.out.println("выбрана станция " + myradio.getCurrentStation());
        //уменьшаю на один и ожидаю 1
        myradio.prev();
        System.out.println("выбрана станция " + myradio.getCurrentStation());
        System.out.println("===============================");
        //выставляю станцию 20 и пробую нажать на кнопку next
        myradio.setCurrentStation(20);
        myradio.next();
        //ожидаю увидеть ноль
        System.out.println("выбрана станция " + myradio.getCurrentStation());

//        System.out.println("выбрана станция " + myradio.getCurrentStation());
//        System.out.println("уровень громкости " + myradio.getCurrentVolume());
//        myradio.increaseVolume();
//        myradio.increaseVolume();
//        System.out.println("уровень громкости " + myradio.getCurrentVolume());
//        myradio.decreaseVolume();
//        myradio.decreaseVolume();
//        System.out.println("уровень громкости " + myradio.getCurrentVolume());
//        myradio.decreaseVolume();
//        System.out.println("уровень громкости " + myradio.getCurrentVolume());
//        for (int i = 1; i <= 100; i++) {
//            myradio.increaseVolume();
//        }
//        System.out.println("уровень громкости " + myradio.getCurrentVolume());
//        myradio.increaseVolume();
//        System.out.println("уровень громкости " + myradio.getCurrentVolume());

    }
}
