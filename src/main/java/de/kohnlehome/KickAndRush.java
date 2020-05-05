package de.kohnlehome;

public class KickAndRush implements Fussballstrategien {
    @Override
    public void taktikAnwenden() {
        System.out.println(this.getClass().getSimpleName());
    }
}
