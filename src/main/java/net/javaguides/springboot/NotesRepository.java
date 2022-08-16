package net.javaguides.springboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import net.javaguides.springboot.Notes.Notes;


@Repository
public interface NotesRepository extends CrudRepository<Notes,Integer>{

}
