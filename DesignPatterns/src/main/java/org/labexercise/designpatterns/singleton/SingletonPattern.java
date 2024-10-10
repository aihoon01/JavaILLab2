package org.labexercise.designpatterns.singleton;

public class SingletonPattern {

    private final Logger logger;
    private String definition = "Singleton method is a design pattern that has only one instance and provides a global access point";

    public SingletonPattern(Logger logger) {
        this.logger = logger;
    }

    public void defineSingleton() {
        logger.log(definition);
    }

    public void defineInUpperCase() {
        logger.logWithCapitals(definition, true);
    }

    public void defineInLowerCase() {
        logger.logWithCapitals(definition, false);
    }

}

class Main {
    public static void main(String[] args) {
        SingletonPattern sp = new SingletonPattern(new Logger());
        sp.defineSingleton();
        sp.defineInUpperCase();
        sp.defineInLowerCase();
    }
}
