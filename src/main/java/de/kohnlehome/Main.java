package de.kohnlehome;

public class Main {
    public static void main(String[] args) {
        Mannschaft mannschaft = new Mannschaft();

        mannschaft.setStrategie(new KickAndRush());
        mannschaft.tuwas();

        mannschaft.setStrategie(new OffensivTaktik());
        mannschaft.tuwas();

        mannschaft.setStrategie(new DefensivTaktik());
        mannschaft.tuwas();
    }
}
