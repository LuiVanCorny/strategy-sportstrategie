package de.kohnlehome;

public class DefensivTaktik implements Fussballstrategien {
    @Override
    public void taktikAnwenden() {
        System.out.println(this.getClass().getSimpleName());
    }
}
