package com.revature.dao;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.revature.model.User;
import com.revature.exception.DuplicateUsernameException;
import com.revature.exception.PasswordTooShortException;
import com.revature.repository.ConnectionUtil;

public class UserDao {

  public List<User> findAll() {
    try (Connection conn = ConnectionUtil.connect()) {
      String sql = "select * from Accounts order by id";
      PreparedStatement ps = conn.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      List<User> list = new ArrayList<>();
      while (rs.next()) {
        try {
          list.add(new User(0, rs.getString(1), rs.getString(2), rs.getString(3), sql, sql, 0));
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

  public User findByString(String s) {
    try (Connection conn = ConnectionUtil.connect()) {
      String sql = "select * from accounts where username = ?";
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setString(1, s);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        try {
          return new User(0, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), 6);
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


  public User insert(User t) {
    try (Connection conn = ConnectionUtil.connect()) {
      String sql = "insert into ers_users (ers_users_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) values (?,?,?,?,?,?,?)";
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setInt(0, t.getId());
      ps.setString(1, t.getUsername());
      ps.setString(2, t.getPassword());
      ps.setString(3, t.getFirstname());
      ps.setString(4, t.getLastname());
      ps.setString(5, t.getEmail());
      ps.setInt(6, t.getUser_role_id());
      ps.execute();
      return findByString(t.getErs_user_id());
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }


  public boolean update(User t, double d) {
    try (Connection conn = ConnectionUtil.connect()) {
      String sql = "update accounts set balance = ? where username = ?";
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setDouble(1, d);
      ps.setString(2, t.getUsername());
      ps.execute();
      return true;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }
}

  

