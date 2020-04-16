package com.revature.model;

import java.sql.Date;

public class Reimbursement {

  private int reimb_id;
  private double reimb_amount;
  private Date reimb_submitted;
  private Date reimb_resolved;
  private String reimb_description;
  private String reimb_receipt;
  private int reimb_author;
  private int reimb_resolver;
  private int reimb_status_id;
  private int reimb_type_id;
  public Reimbursement(int reimb_id, double reimb_amount, Date date,
      Date date2, String reimb_description, String reimb_receipt, int reimb_author,
      int reimb_resolver, int reimb_status_id, int reimb_type_id) {
    super();
    
    this.reimb_id = reimb_id;
    this.reimb_amount = reimb_amount;
    this.reimb_submitted = date;
    this.reimb_resolved = date2;
    this.reimb_description = reimb_description;
    this.reimb_receipt = reimb_receipt;
    this.reimb_author = reimb_author;
    this.reimb_resolver = reimb_resolver;
    this.reimb_status_id = reimb_status_id;
    this.reimb_type_id = reimb_type_id;
  }
  
  public Reimbursement(int i, String string, String string2, String string3, String string4,
      String string5, int j) {
    // TODO Auto-generated constructor stub
  }

//  public Reimbursement(int reimb_id2, double double1, Date date, Date date2, String string,
//      String string, int int1, int int2, int int3, int int4) {
//    // TODO Auto-generated constructor stub
//  }

  public int getReimb_id() {
    return reimb_id;
  }
  
  public void setReimb_id(int reimb_id) {
    this.reimb_id = reimb_id;
  }
  
  public double getReimb_amount() {
    return reimb_amount;
  }
  
  public void setReimb_amount(double reimb_amount) {
    this.reimb_amount = reimb_amount;
  }
  
  public Date getReimb_submitted() {
    return reimb_submitted;
  }
  
  public void setReimb_submitted(Date reimb_submitted) {
    this.reimb_submitted = reimb_submitted;
  }
  
  public Date getReimb_resolved() {
    return reimb_resolved;
  }
  
  public void setReimb_resolved(Date reimb_resolved) {
    this.reimb_resolved = reimb_resolved;
  }
  
  public String getReimb_description() {
    return reimb_description;
  }
  
  public void setReimb_description(String reimb_description) {
    this.reimb_description = reimb_description;
  }
  
  public String getReimb_receipt() {
    return reimb_receipt;
  }
  
  public void setReimb_receipt(String reimb_receipt) {
    this.reimb_receipt = reimb_receipt;
  }
  
  public int getReimb_author() {
    return reimb_author;
  }
  
  public void setReimb_author(int reimb_author) {
    this.reimb_author = reimb_author;
  }
  
  public int getReimb_resolver() {
    return reimb_resolver;
  }
  
  public void setReimb_resolver(int reimb_resolver) {
    this.reimb_resolver = reimb_resolver;
  }
  
  public int getReimb_status_id() {
    return reimb_status_id;
  }
  
  public void setReimb_status_id(int reimb_status_id) {
    this.reimb_status_id = reimb_status_id;
  }
  
  public int getReimb_type_id() {
    return reimb_type_id;
  }
  
  public void setReimb_type_id(int reimb_type_id) {
    this.reimb_type_id = reimb_type_id;
  }
  
  @Override
  public String toString() {
    return "Reimbursement [reimb_id=" + reimb_id + ", reimb_amount=" + reimb_amount
        + ", reimb_submitted=" + reimb_submitted + ", reimb_resolved=" + reimb_resolved
        + ", reimb_description=" + reimb_description + ", reimb_receipt="
        + reimb_receipt + ", reimb_author=" + reimb_author + ", reimb_resolver="
        + reimb_resolver + ", reimb_status_id=" + reimb_status_id + ", reimb_type_id="
        + reimb_type_id + "]";
  }

  public int getUserid() {
    // TODO Auto-generated method stub
    return 0;
  }

  public String getUsername() {
    // TODO Auto-generated method stub
    return null;
  }

  public String getPassword() {
    // TODO Auto-generated method stub
    return null;
  }

  public String getFirstname() {
    // TODO Auto-generated method stub
    return null;
  }

  public String getLastname() {
    // TODO Auto-generated method stub
    return null;
  }

  public String getEmail() {
    // TODO Auto-generated method stub
    return null;
  }

  public int getUser_role_id() {
    // TODO Auto-generated method stub
    return 0;
  }

  public String getErs_user_id() {
    // TODO Auto-generated method stub
    return null;
  }
  
  
}
