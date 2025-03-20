public abstract class Title {
    private String title;
    protected String literatureType;
    private final double pointRate = 0.067574; // Rate as of 2025

    public Title(String title, String literatureType){
        this.title = title;
        this.literatureType = literatureType;
    }

    protected abstract double calculatePoints();

    public double calculateRoyalty(){
        return calculatePoints() * pointRate;
    }

    protected double convertLiteratureType(){
        double royaltyValue = 0.0;
        switch (this.literatureType) {
            case "BI":
                royaltyValue = 3.0;
                break;
            case "TE":
                royaltyValue = 3.0;
                break;
            case "LYRIK":
                royaltyValue = 6.0;
                break;
            case "SKØN":
                royaltyValue = 1.7;
                break;
            case "FAG":
                royaltyValue = 1.0;
                break;
        }
        return royaltyValue;
    }

}
