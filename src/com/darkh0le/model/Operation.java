package com.darkh0le.model;

/**
 * @author $darkh0le
 */
public enum Operation {
    DELETE("delete"),
    SEARCH("search"),
    UPDATE("update"),
    INSERT("insert");

    private final String operation;

    Operation(final String text) {
        this.operation = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return operation;
    }
}
