package net.javaguides.springboot.Cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.Notes.Notes;
import net.javaguides.springboot.Service.NotesService;

@RestController
public class NotesController {
	@Autowired
	NotesService notesService;
	
	@GetMapping("/hello")
	public String getAll(){
		return "helloworld";
		}

	@GetMapping("/notes")
	private List<Notes> getAllNotes() {
		return notesService.getAllNotes();
	}

	@GetMapping("/notes/{noteid}")
	private Notes getNotes(@PathVariable("noteid")int noteid) 
	{
		return notesService.getNotesById(noteid);
	}
	@PostMapping("/notes")  
	private int saveNotes(@RequestBody Notes notes)
	{
		notesService.saveOrUpdate(notes);
		return notes.getNoteid();
	}
	@DeleteMapping("/notes/{noteid}")
	private String deleteNotes(@PathVariable("noteid") int noteid) {
		notesService.delete(noteid);
		return "notes deleted"+noteid;
	}
}
