package com.alvin.pattern.explain;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 8:34 PM
 */
//终结符表达式角色 变量表达式
public class Variable extends AbstractExpression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context ctx) {
        return ctx.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}

