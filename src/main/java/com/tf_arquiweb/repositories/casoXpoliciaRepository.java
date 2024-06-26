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
            "cp.fecha_revision \n" +
            "from caso_xpolicia cp \n" +
            "inner join \n" +
            "policia p on \n" +
            "cp.policia_id = p.id \n" +
            "inner join \n" +
            "comisaria co on \n" +
            "p.id = co.policia_id \n" +
            "inner join \n" +
            "distrito d on \n" +
            "co.distrito_id = d.id \n" +
            "where cp.estado = 'EN PROCESO' " +
            "order by cp.fecha desc", nativeQuery = true)
    public List<String[]> casosAtrasados();
    @Query(value = "SELECT po.nombre,\n" +
            "(SELECT count(*) \n" +
            "FROM caso_xpolicia csp \n" +
            "WHERE csp.policia_id = po.id AND csp.estado = 'Resuelto') as casos_resueltos_policia\n" +
            "FROM policia po", nativeQuery = true)
    public List<String[]> casosresueltosxpolicia();

}
