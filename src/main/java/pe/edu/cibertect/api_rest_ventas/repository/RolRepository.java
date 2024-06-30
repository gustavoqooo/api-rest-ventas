package pe.edu.cibertect.api_rest_ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertect.api_rest_ventas.model.bd.Rol;

@Repository
public interface RolRepository extends
        JpaRepository<Rol, Integer> {
    //Select * from rol where nomrol = 'ADMIN'
    Rol findByNomrol(String nomrol);
}
