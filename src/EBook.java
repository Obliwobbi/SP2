public class EBook extends NetBook {

    private int characters;
    private boolean illustrated = true;

    public EBook(String title, String literatureType,int availability, int reach, int use, int characters, boolean illustrated){
        super(title,literatureType,availability,reach,use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    private double calculatePages(){
        if (!illustrated){
            return this.characters/1800+20;
        } else {
            return (this.characters/1800+20) * 1.1; // If the eBook is illustrated + 10%
        }
    }

    @Override
    public double calculatePoints(){
        return this.calculatePages() * this.convertLiteratureType() * this.getPseudoCopies();
    }
}