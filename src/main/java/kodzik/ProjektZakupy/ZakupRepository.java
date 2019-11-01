package kodzik.ProjektZakupy;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// CrudRepository<TYP_DO_PRZECHOWANIA, KLUCZ_GLOWNY_TEGO_TYPU_W_BAZIE>
public interface ZakupRepository extends CrudRepository<Zakup, Integer> {

    @Query("Select z from Zakup z where z.statusZakupow=?1")
    List<Zakup> znajdzPoStatusie(Boolean status);
    //spring sam potrafi wygenerowac SQLna podstawie nazwy metody
//    List<Zakup> findByStatusZakupow(Boolean statusZakupow);

}
