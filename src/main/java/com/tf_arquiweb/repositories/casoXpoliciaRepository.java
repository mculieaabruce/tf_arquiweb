package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.casoXpolicia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface casoXpoliciaRepository extends JpaRepository<casoXpolicia, Integer> {
    @Query(value = "select \n" +
            "p.nombre,\n" +
            "p.num_placa,\n" +
            "d.nombre,\n" +
            "cp.fecha \n" +
            "from casoXpolicia cp \n" +
            "inner join \n" +
            "policia p on \n" +
            "cp.policia_id = p.id \n" +
            "inner join \n" +
            "comisaria co on \n" +
            "p.id = co.policia_id \n" +
            "inner join \n" +
            "distrito d on \n" +
            "co.distrito_id = d.id \n" +
            "where cp.estado = 'En proceso' " +
            "order by cp.fecha desc", nativeQuery = true)
    public List<String[]> casosAtrasados();
}
