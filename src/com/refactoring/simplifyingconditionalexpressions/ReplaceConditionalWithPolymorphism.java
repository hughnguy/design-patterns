package com.refactoring.simplifyingconditionalexpressions;

public class ReplaceConditionalWithPolymorphism {

    double numberOfCoconuts;
    double voltage;
    boolean isNailed;

    enum Type {
        EUROPEAN,
        AFRICAN,
        NORWEGIAN_BLUE,
    }

    /////// Problem ///////

    /**
     * You have a conditional that performs various actions depending on object type or properties.
     */
    class Bird {
        double getSpeedV1(Type type) {
            switch (type) {
                case EUROPEAN:
                    return getBaseSpeed();
                case AFRICAN:
                    return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
                case NORWEGIAN_BLUE:
                    return (isNailed) ? 0 : getBaseSpeed(voltage);
            }
            throw new RuntimeException("Should be unreachable");
        }
    }

    /////// Solution ///////

    /**
     * Create subclasses matching the branches of the conditional. In them, create a shared method and move code
     * from the corresponding branch of the conditional to it. Then replace the conditional with the relevant method call.
     * The result is that the proper implementation will be attained via polymorphism depending on the object class.
     */
    abstract class Bird2 {
        abstract double getSpeed();
    }

    class European extends Bird2 {
        double getSpeed() {
            return getBaseSpeed();
        }
    }
    class African extends Bird2 {
        double getSpeed() {
            return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
        }
    }
    class NorwegianBlue extends Bird2 {
        double getSpeed() {
            return (isNailed) ? 0 : getBaseSpeed(voltage);
        }
    }

    void test() {
        Bird2 bird = new European();
        double speed = bird.getSpeed();
    }

    /////////////////////
    double getBaseSpeed() {return 0;};
    double getBaseSpeed(double voltage) {return 0;};
    double getLoadFactor() {return 0;};
}
