public class EBook extends NetBook {

    private int characters;
    private boolean illustrated = true;

    public EBook(String title, String literatureType,int availability, int reach, int use, int characters, boolean illustrated){
        super(title,literatureType,availability,reach,use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    public double calculatePages(){
        double pages = (this.characters/1800.0)+20;
        if (illustrated){
            pages *= 1.1;
        }
        return pages;
    }

    @Override
    public double calculatePoints(){
        return this.calculatePages() * this.convertLiteratureType() * this.getPseudoCopies();
    }
}