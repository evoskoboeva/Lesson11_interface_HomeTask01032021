package Task2;

import javax.naming.Name;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {
    //Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
        // Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
        // Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
        // Создать массив типа Инструмент, содержащий инструменты разного типа.
        // В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
        // "Играет такой-то инструмент с такими-то характеристиками".

        Guitar ukulele = new Guitar(4);
        Guitar classic = new Guitar(7);
        Guitar electro = new Guitar(6);
        Trumpet trumplet = new Trumpet(30);
        Drum drumBas = new Drum(50);

        Bandle bandle1 = new Bandle(5);
        bandle1.bandles[0] = ukulele;
        bandle1.bandles[1] = classic;
        bandle1.bandles[2]=electro;
        bandle1.bandles[3]=trumplet;
        bandle1.bandles[4]=drumBas;
        System.out.println(bandle1);

        for (int i = 0; i < bandle1.bandles.length; i++) {
            bandle1.bandles[i].Play();
            System.out.println(bandle1.bandles[i]); //можно ли как то вывести имя экземпляра например ukulele
            // - без создания поля name?

        }
    }
    }
