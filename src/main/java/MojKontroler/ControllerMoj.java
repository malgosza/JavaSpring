package MojKontroler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController // komponent do polaczenia HTTP (np. GET, POST, PUT itd.)
@RequestMapping // do JSON
public class ControllerMoj {

    @GetMapping("/data")
    public String pobierzDate() {
        Date data = new Date();
        return data.toString();
    }

    @GetMapping("/wsp")
    public WspolrzedneGeo wspolrzedneGeo() {
        WspolrzedneGeo wspolrzedneGeo = new WspolrzedneGeo();
        wspolrzedneGeo.setDlugosc("123");
        wspolrzedneGeo.setSzerokosc("534");

        return wspolrzedneGeo;
    }
}