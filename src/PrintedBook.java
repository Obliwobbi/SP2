public class PrintedBook extends PhysicalBook {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        double royaltyValue = convertLiteratureType();
        return pages * royaltyValue * copies;
    }
}
