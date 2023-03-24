import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Plant> plants = new ArrayList<>();
        Plant a = new Plant();

        a.setTitle("Rugštynė");
        a.setLatin("Rumex acetosa");
        a.setAnnual(false);
        a.setContinent("Europa");
        a.setHeight("0,6");
        a.setEatable(true);

        Plant b = new Plant();
        b.setTitle("Dilgėlė");
        b.setLatin("Urtica dioica ");
        b.setAnnual(false);
        b.setContinent("Europa");
        b.setHeight("1.5");
        b.setEatable(true);


        Plant c = new Plant( "Sojos pupelė","Glycine fabaceae", true, "Azija", "0,6",true);

        Plant d = new Plant( "Cūga","Tsuga canadensis", false, "Šiaurės Amerika","1,6", true);

        plants.add(a);
        plants.add(b);
        plants.add(c);
        plants.add(d);

        System.out.print(plants);


        for (int i = 0; i <plants.size() ; i++) {
            System.out.println(plants.get(i));
        }

    }


}