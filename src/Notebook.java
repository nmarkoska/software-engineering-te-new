import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Notebook {

    List<Note> notes = new ArrayList<>();

    //add a note
    public void add(Note note) {

        this.notes.add(note);
    }

    public void add(String title, String description){
        Note note = new Note(title, description);
        this.notes.add(note);
    }



    //delete a note by index
    public void deleteNoteByIndex(int index){
        this.notes.remove(index);}


    //total notes
        public int totalNotes(){
            return this.notes.size();

        }

        //search a specific note by title
    public void searchByTitle(String title){
        for (Note note: this.notes){

            if (note.getTitle().equals(title)){
                System.out.println(note);
            }
        }
    }

    //searching  by substring
    public void searchBySubstring(String text){
        for (Note note: this.notes){

            if(note.getTitle().toLowerCase().contains(text.toLowerCase()) ||
            note.getDescription().toLowerCase().contains(text.toLowerCase())) {
                System.out.println(note);
            }
        }
    }
    @Override
    public String toString() {
        return "Notebook{" +
                "notes=" + notes +
                '}';
    }
}
