package kodzik.Booki;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // znaczy to, ze to jest encja bazodanowa
@Data // to tworzy wszytskie gety i sety
public class Book {
    private String tytul;
    private Integer liczbaStron;

    @Id
    @GeneratedValue
    private Integer id;

}
