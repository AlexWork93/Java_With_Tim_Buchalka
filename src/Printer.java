public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel < 0 ? -1 : tonerLevel > 100 ? -1 : tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100) return -1;
        else if (this.tonerLevel + tonerAmount > 100) return -1;
        else{
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
    }

    public int printPages(int pages) {
        if (pages < 0) return -1;
        else if (duplex) {
            pages = (int)Math.ceil((double)pages / 2);
        }
        pagesPrinted += pages;
        return pages;
    }
}
