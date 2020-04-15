package com.revature.model;

public class ReimbursementStatus {

  private int statusId;
  private String reimb_status;
  public ReimbursementStatus(int statusId, String reimb_status) {
    super();
    this.statusId = statusId;
    this.reimb_status = reimb_status;
  }
  public int getStatusId() {
    return statusId;
  }
  public void setStatusId(int statusId) {
    this.statusId = statusId;
  }
  public String getReimb_status() {
    return reimb_status;
  }
  public void setReimb_status(String reimb_status) {
    this.reimb_status = reimb_status;
  }
  @Override
  public String toString() {
    return "ReimbursementStatus [reimb_statusid=" + statusId + ", reimb_status=" + reimb_status + "]";
  }

}
