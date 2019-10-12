package zwierzaczki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Podworko {
    @Autowired
    private Piesek maxik;

    @Autowired // dzieki temu nie musze uzywac konstruktora, spring sam stworzy i wstrzyknie
    private Kotek irys;
//    private JdbcTemplate jdbcTemplate; // jesli mam skomplikowane obiekty()np. baza danych -> duzo rzeczy trzeba
                                        //ustawic recznie to Spring zrobi mi to automatycznie
//    public Podworko(){
//        maxik=new Piesek();
//        irys=new Kotek();
//    }

    public void spacer(){
        maxik.Szczekaj();
        irys.Mnialkaj();
    }
}
