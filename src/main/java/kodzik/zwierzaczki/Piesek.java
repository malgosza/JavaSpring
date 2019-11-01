package kodzik.zwierzaczki;

import org.springframework.stereotype.Component;

@Component  //jak uruchamia sie spring to szuka wszystkich Componentów
            // i je przechowuje, nie musze sama tworzyc obiektów
public class Piesek {
    public void Szczekaj(){
        System.out.println("Szczek szczek");
    }       //klasa per plik -> w jednym pliku jedna klasa
}
