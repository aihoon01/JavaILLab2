package org.labexercise.designpatterns.singleton;

public class SingletonPattern {

    // Step 1: A private static instance of itself
    private static SingletonPattern instance;

    private final Logger logger;
    private String definition = "Singleton method is a design pattern that has only one instance and provides a global access point";

    // Step 2: Private constructor to prevent instantiation
    private SingletonPattern(Logger logger) {
        this.logger = logger;
    }

    // Step 3: Public static method to provide global access to the instance
    public static synchronized SingletonPattern getInstance(Logger logger) {
            if (instance == null) {
                instance = new SingletonPattern(logger);
        }
        return instance;
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
        Logger logger = new Logger();
        SingletonPattern sp = SingletonPattern.getInstance(logger);
        sp.defineSingleton();
        sp.defineInUpperCase();
        sp.defineInLowerCase();
    }
}
