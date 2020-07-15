package cuenca.alex.ejemploAppRecetas.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import cuenca.alex.ejemploAppRecetas.entities.Receta;

public interface RecetaRepo extends CrudRepository <Receta, Long>{
	
	List<Receta> findByNombre(String nombre);//Se utiliza como campo para la busqueda

}
