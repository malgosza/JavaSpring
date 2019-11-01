package kodzik.ProjektZakupy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class ZakupController {

    @Autowired
    ZakupRepository zakupRepository;

    //Backend  -->> to co przychodziz Frontu
    @PostMapping("/stworzZakup")
    public Zakup stworzZakup(@RequestBody Zakup zakup) {
        zakup.setStatusZakupow(false);
        Zakup zapisanyWbazieObiekt = zakupRepository.save(zakup);
        return zapisanyWbazieObiekt;
    }

    @DeleteMapping ("/usunZakup")
    public void usunZakup(@RequestBody Zakup zakup){
        zakupRepository.delete(zakup);
    }

    @PutMapping("/aktualizacjaZakupow")
    public Zakup aktualizacjaStatutuZakupow(@RequestBody Zakup zakup){
        return zakupRepository.save(zakup);
    }

    @GetMapping("/zakup/{id}")
    public Zakup getZakup(@PathVariable Integer id){
        return zakupRepository.findById(id).get();
    }

    @GetMapping("/znajdzWszystkie")
    public List<Zakup> getAllzakup(@RequestParam(required = false) Boolean status){
        if (status!=null) {
//            return zakupRepository.findByStatusZakupow(status);
            return zakupRepository.znajdzPoStatusie(status);
        }
        return (List<Zakup>) zakupRepository.findAll();

    }

//    public Zakup dodajProduktDoListy(){}
//
//    public Zakup usunProduktZlisty(){}



}
