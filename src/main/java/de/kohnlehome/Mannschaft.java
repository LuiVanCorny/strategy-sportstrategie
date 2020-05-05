package de.kohnlehome;

public class Mannschaft {
    private Fussballstrategien strategie;

    public void setStrategie(Fussballstrategien strategie) {
        this.strategie = strategie;
    }

    public void tuwas(){
        strategie.taktikAnwenden();
    }
}
