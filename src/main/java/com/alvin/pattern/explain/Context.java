package com.alvin.pattern.explain;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 8:35 PM
 */
//环境类
public class Context {
    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        Integer value = map.get(var);
        return value;
    }
}