package net.javaguides.springboot;

import org.springframework.data.repository.CrudRepository;

import net.javaguides.springboot.Notes.Notes;



public interface NotesRepository extends CrudRepository<Notes,Integer>{

}
