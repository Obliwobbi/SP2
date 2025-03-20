public abstract class NetBook extends Title{
    private int availability;
    private int reach;
    private int use;

    public NetBook (String title, String literatureType, int availability, int reach, int use){
        super(title, literatureType);
        this.use = use;
        this.availability = availability;
        this.reach = reach;
    }

    protected double getPseudoCopies(){
        return (this.availability*0.5) + getUseFactor();
    }

    private int getUseFactor(){
        return (this.reach*5) + this.use;
    }
}

