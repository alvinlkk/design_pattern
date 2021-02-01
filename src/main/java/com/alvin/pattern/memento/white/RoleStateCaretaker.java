package com.alvin.pattern.memento.white;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 8:12 PM
 */
//角色状态管理者类
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
