package edu.arelance.nube.service;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import dto.FraseChuckNorris;
import edu.arelance.nube.repository.entity.Restaurante;

public interface RestauranteService {
	
	Iterable<Restaurante> consultarTodos ();
	
	Optional<Restaurante> consultarRestaurante (Long id);
	
	Restaurante altaRestaurante (Restaurante restaurante);
	
	void borrarRestaurante (Long id);
	
	Optional<Restaurante> modificarRestaurante (Long id, Restaurante restaurante);

	Iterable<Restaurante> buscarPorRangoPrecio (int preciomin, int preciomax);
	
	public Iterable <Restaurante> buscarPorBarrioNombreOEspecialidad (String clave);
	
	Iterable <Restaurante> obtenerTodosLosBarrios ();
	
	Optional<FraseChuckNorris> obtenerFraseAleatorioChuckNorris ();

	Page<Restaurante> consultarPorPagina(Pageable pageable);
	
	Iterable<Restaurante> buscarPorRangoPrecio (int preciomin, int preciomax, Pageable pageable);
	
}