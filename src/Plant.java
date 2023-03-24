public class Plant {
    private String title;
    private String latin;

    private boolean annual;

    private String  continent;

    private String height;

    private boolean eatable;

    public Plant(){

    }

    public Plant(String title, String latin, boolean annual, String continent, String height, boolean eatable) {
        this.title = title;
        this.latin = latin;
        this.annual = annual;
        this.continent = continent;
        this.height = height;
        this.eatable = eatable;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLatin() {
        return this.latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public boolean isAnnual() {
        return this.annual;
    }

    public void setAnnual(boolean annual) {
        this.annual = annual;
    }

    public String getContinent() {
        return this. continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getHeight() {
        return this. height;
    }

    public String setHeight(String height) {
        return ( "height");
    }

    public boolean isEatable() {
        return this. eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    @Override
    public String toString() {
        return (" Augalo pavadinimas " + title +"." + " Lotyniškas pavadinimas " +
                latin + "." + (this.annual? "Vienmetis," : "Daugiametis,")) + " auga žemyne - " +
                continent +"." + " Suaugusio augalo aukštis " +
                height + " metrai. " + "Jis yra "+ (this.eatable?" valgomas. ": "nevalgomas.");

    }






}
