package com.revature.model;

public class User {
  private int id;
  private String username;
  private String password;
  private String firstname;
  private String lastname;
  private String email;
  private int roleid;
  public User() {
    super();
    // TODO Auto-generated constructor stub
  }
  public User(int id, String username, String password, String firstname, String lastname,
      String email, int roleid) {
    super();
    this.id = id;
    this.username = username;
    this.password = password;
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.roleid = roleid;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public int getRoleid() {
    return roleid;
  }
  public void setRoleid(int roleid) {
    this.roleid = roleid;
  }
  @Override
  public String toString() {
    return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname="
        + firstname + ", lastname=" + lastname + ", email=" + email + ", roleid=" + roleid + "]";
  }
  public String getErs_user_id() {
    // TODO Auto-generated method stub
    return null;
  }
  public int getUser_role_id() {
    // TODO Auto-generated method stub
    return 0;
  }


}
