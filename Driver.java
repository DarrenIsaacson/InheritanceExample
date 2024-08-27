import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        
        //Books
        Item book1 = new Book("The Quantum Enigma", 24.99, "Dr. Emma Clarke", "2nd Edition", "Quantum Insights Publishing", 2022);
        Item book2 = new Book("The Art of Digital Design", 39.95, "James O'Connor, Laura Mitchell", "1st Edition", "Creative Minds Press", 2023);
        Item book3 = new Book("Kraken", 23.54, "Childish Gambino", "2", "EA", 2018);

        //MusicCD
        Item musicCD1 = new MusicCD("Echoes of the Past", 14.99, "Liam Stone, Ella Grace", "2024" , "Harmony Records", "Soundwave Ltd.", 45, "Classical, Ambient");
        Item musicCD2 = new MusicCD("Neon Dreams", 17.49, "The Synthwaves", "2020", "ElectroWave", "Future Sounds", 52, "Electronic, Synthwave");

        //Software
        Item software1 = new Software("ProDesign Suite", 199.99, "v5.4");
        Item software2 = new Software("DataGuard Antivirus", 49.95, "v3.2.1");
        List<ItemEntry> list = new ArrayList<>();

        list.add(new ItemEntry(book1, 15));
        list.add(new ItemEntry(book2, 100));
        list.add(new ItemEntry(book3, 150));
        list.add(new ItemEntry(musicCD1, 30));
        list.add(new ItemEntry(musicCD2, 740));
        list.add(new ItemEntry(software1, 123));
        list.add(new ItemEntry(software2, 213));


        for (ItemEntry ie : list) {
            String str = String.format("%1$s, %2$s, %3$f, %4$i", ie.getItem().getTitle(), ie.getClass().getSimpleName(), ie.getItem().getPrice(), ie.getQuanity());
            System.out.println(str);
        }

    }
}
