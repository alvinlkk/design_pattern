package com.alvin.pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-28 11:33 PM
 */
public class Order {
    // 餐桌号码
    private int diningTable;

    // 用来存储餐名并记录份数
    private Map<String, Integer> foodDic = new HashMap<String, Integer>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name, int num) {
        foodDic.put(name,num);
    }
}
