package com.alvin.pattern.memento.black;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 8:16 PM
 */
//角色状态管理者类
public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
