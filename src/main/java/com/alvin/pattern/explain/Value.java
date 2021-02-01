package com.alvin.pattern.explain;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 8:34 PM
 */
public class Value extends AbstractExpression {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return new Integer(value).toString();
    }
}