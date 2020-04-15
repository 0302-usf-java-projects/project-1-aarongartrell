package com.revature.model;



public class UserRoles {

  private int roleId;
  private String userRole;
  public UserRoles(int roleId, String userRole) {
    super();
    this.roleId = roleId;
    this.userRole = userRole;
  }
  
  
  public int getRoleId() {
    return roleId;
  }
  public void setRoleId(int roleId) {
    this.roleId = roleId;
  }
  public String getUserRole() {
    return userRole;
  }
  public void setUserRole(String userRole) {
    this.userRole = userRole;
  }
  @Override
  public String toString() {
    return "UserRoles [ers_user_role_id=" + roleId + ", user_role=" + userRole + "]";
  }
  
  
  
}
