package com.revature.dao;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.revature.model.Reimbursement;
import com.revature.repository.ConnectionUtil;


  public class RequestDao  {

    public List<Reimbursement> findAll() {
      try (Connection conn = ConnectionUtil.connect()) {
        String sql = "select * from Reimbursement order by id";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Reimbursement> list = new ArrayList<>();
        while (rs.next()) {
          try {
            list.add(new Reimbursement(0, rs.getDouble(1), rs.getDate(2), rs.getDate(3), rs.getString(4), rs.getByte(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9)));
          } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        return list;
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return null;
    }

    public Reimbursement findByString(String s) {
      try (Connection conn = ConnectionUtil.connect()) {
        String sql = "select * from accounts where username = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, s);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
          try {
            return new Reimbursement(0, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), 0);
          } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return null;
    }


    public Reimbursement insert(Reimbursement t) {
      try (Connection conn = ConnectionUtil.connect()) {
        String sql = "insert into ers_reimbursement (ers_users_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) values (?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, t.getUserid());
        ps.setString(2, t.getUsername());
        ps.setString(3, t.getPassword());
        ps.setString(4, t.getFirstname());
        ps.setString(5, t.getLastname());
        ps.setString(6, t.getEmail());
        ps.setInt(7, t.getUser_role_id());
        ps.execute();
        return findByString(t.getErs_user_id());
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return null;
    }
    
  }


   // public boolean update(Reimbursement t) {
     // try (Connection conn = ConnectionUtil.connect()) {
       // String sql = "update accounts set balance = ? where username = ?";
        //PreparedStatement ps = conn.prepareStatement(sql);
        //ps.setDouble(1, d);
        //ps.setString(2, t.getUsername());
        //ps.execute();
        //return true;
      //} catch (SQLException e) {
        //e.printStackTrace();
      //}
     // return false;
    //}
  //}
  

