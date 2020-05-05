package de.kohnlehome;

public class OffensivTaktik implements Fussballstrategien {
    @Override
    public void taktikAnwenden() {
        System.out.println(this.getClass().getSimpleName());
    }
}
