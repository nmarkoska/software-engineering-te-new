public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();

        Note note = new Note("Neda", "My name is Neda Markoska");

        notebook.add(note);
        notebook.add("Ana", "My name is Ana Apostolovska");
        notebook.add("Marija", "My name is Marija Efremovska");
        notebook.add("Martina", "My name is Martina Gichenko");
        notebook.add("Hristijan", "My name is Hristijan Stojkovski");




        System.out.println("Total notes:" + notebook.totalNotes());
        System.out.println(notebook.toString());
        notebook.deleteNoteByIndex(1);
        System.out.println("Total notes:" + notebook.totalNotes());
        System.out.println(notebook.toString());

        System.out.println("Search by title Neda: ");
        notebook.searchByTitle("Neda");

        System.out.println("Search by substring Marija: ");
        notebook.searchBySubstring("Marija");
    }
}
