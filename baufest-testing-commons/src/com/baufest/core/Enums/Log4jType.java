package src.com.baufest.core.Enums;

/**
 * Created by Miguel D'Alessio
 * on 21/9/2017.
 */
public enum Log4jType {

    INFO("info"),
    ERROR("error"),
    FATAL("fatal"),
    NEXT("next");

    Log4jType(String element) {
        this.element = element;
    }

    private String element;

    public String element() {
        return element;
    }
}
