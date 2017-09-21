package src.com.baufest.core.Enums;

/**
 * Created by Miguel D'Alessio
 * on 21/9/2017.
 */
public enum WaitType {

    SLEEP("sleep"),
    IMPLICIT("implicit"),
    CLICKABLE("clickable"),
    VISIBILITY("visibility"),
    INVISIVILITY("invisibility");

    WaitType(String element) {
        this.element = element;
    }

    private String element;

    public String element() {
        return element;
    }
}

