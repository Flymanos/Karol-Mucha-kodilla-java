package com.kodilla.patterns.builder.bigmac;

public class RollFactory {
    public static final boolean WITHSEZAM = true;
    public static final boolean NOSEZAM = false;

    public static Roll makeRoll(final boolean withSezam){
        return new Roll(withSezam);
    }
}
