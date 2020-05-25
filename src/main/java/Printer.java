public class Printer {

    private int pages;
    private int copies;
    private int toner;

    public Printer(int pages, int copies, int toner){
        this.pages = pages;
        this.copies = copies;
        this.toner = toner;
    }

    public String print(int pages, int copies){
        if (pages >= copies){
            pages -= copies;
            this.toner -= copies;
            return "There are " + pages + " sheets remaining.";
        }else{
            return "Not enough paper!";
        }
    }
}
