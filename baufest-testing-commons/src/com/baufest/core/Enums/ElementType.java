package src.com.baufest.core.Enums;

/**
 * Created by Miguel D'Alessio
 * on 21/9/2017.
 */
public enum ElementType {

    CLICK("click"),
    SEND_KEY("send_key");

    ElementType(String element) {
        this.element = element;
    }

    private String element;

    public String element() {
        return element;
    }
}
