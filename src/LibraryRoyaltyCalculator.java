public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {
        Author a1 = new Author("Jan Erik");
        Author a2 = new Author("Frans Sørensen");
        Author a3 = new Author("Kirsten Kirkehopper");

        a1.addTitle(new AudioBook("Bog1","TE",100,300));
        a1.addTitle(new PrintedBook("Bog2","FAG",100, 400));
        a1.addTitle(new EBook("Bog3", "LYRIK", 20, 60, 50, 100000, true));
        a1.addTitle(new EAudioBook("Bog4","SKØN",20,60,50,480));

        a2.addTitle(new PrintedBook("Bog1","LYRIK",100, 300));
        a2.addTitle(new EAudioBook("Bog2","LYRIK",20,60,50,480));
        a2.addTitle(new EBook("Søren fandt en høne","BI",40,50,60,130000,false));
        a2.addTitle(new AudioBook("Bogen om bøger","LYRIK",300,280));

        a3.addTitle(new PrintedBook("En vej på gangen", "SKØN", 20000, 544));

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
