package com.oracle.vo;

import java.util.List;

public class Role {
    int roleid;
    String roleName;
    String roleDesc;
    List<Right> rights;

    public Role() {}

    public Role(int roleid) {
        super();
        this.roleid = roleid;
    }

    public int getRoleid() {
        return roleid;
    }
    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleDesc() {
        return roleDesc;
    }
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
    public List<Right> getRights() {
        return rights;
    }
    public void setRights(List<Right> rights) {
        this.rights = rights;
    }
    @Override
    public String toString() {
        return "Role [roleid=" + roleid + ", roleName=" + roleName + ", roleDesc=" + roleDesc + ", rights=" + rights
                + "]";
    }

}
