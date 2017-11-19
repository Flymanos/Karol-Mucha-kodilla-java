package com.kodilla.patterns.builder.bigmac;

public class Roll {
    private boolean withSezam;

    public Roll(boolean isWithSezam) {
        this.withSezam = isWithSezam;
    }

    public boolean isWithSezam() {
        return withSezam;
    }
}
