package kodzik.ProjektZakupy;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Zakup {
    private String tytulZakupow;
    private Date dataZakupow;
    private Boolean statusZakupow;

    @Id
    @GeneratedValue
    private Integer id;
}
