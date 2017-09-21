package src.com.baufest.core.Enums;

/**
 * Created by Miguel D'Alessio
 * on 21/9/2017.
 */

public enum AssertType {

    ASSERT_NULL("null"),
    ASSERT_NOTNULL("notnull"),
    ASSERT_EQUALS("equals"),
    ASSERT_NOTEQUALS("notequals");

    AssertType(String element) {
        this.element = element;
    }

    private String element;

    public String element() {
        return element;
    }
}


