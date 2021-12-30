/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author eamon
 */
public class DBMethods {
    static public Connection connection;
    
    public static Connection getConnection() throws Exception{
        if(connection == null)
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            // eamon - Reead this in from a file??
            //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingApp","root","Passw0rd");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingApp","root","Passw0rd");
            }
            catch (SQLException ex) {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
            
        }
        return connection;
    }
    public static void Login(String username, String password) throws Exception{
            Connection conn = DBMethods.getConnection();
            if(username !=null){
                String query ="Select * from logins Where username = ? and password = ?";
                
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, username);
                statement.setString(2, password);
                
                ResultSet rs = statement.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Login Successful");
                    new Menu().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                    new Login().setVisible(true);
                }
            }
    }
    
    public static void deleteAccount(int id) throws Exception
    {
        try{
            Connection con = getConnection();
            
            String query = "delete from account where accountID = ?";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1,id);
            preparedStmt.executeUpdate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{}
    }
    
    
    public static void createAccount(Account acc) throws Exception
    {
        try{
            Connection con = getConnection();
            
            String query = "insert into account values (?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, 0); // will be created by db
            preparedStmt.setString(2, acc.getFirstName());
            preparedStmt.setString(3, acc.getLastName());
            preparedStmt.setString(4, acc.getEmail());
            preparedStmt.setString(5, acc.getPhone());
            preparedStmt.setString(6, acc.getAddress());
            preparedStmt.setString(7, acc.getCity());
            preparedStmt.setInt(8, acc.getAccountNumber());
            preparedStmt.setInt(9, acc.getSortCode());
            preparedStmt.setInt(10, acc.getBalance());
            preparedStmt.setInt(11, acc.getOverdraftLimit());
            preparedStmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Account created!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{}
    }

    public static void updateAccount(Account acc) throws Exception
    {
        try{
            Connection con = getConnection();
            
            String query = "update account set firstname = ?, lastname = ?, email = ?,  "
                    + "phoneNumber = ?, address = ?, city = ?  where accountID = ?";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, acc.getFirstName());
            preparedStmt.setString(2, acc.getLastName());
            preparedStmt.setString(3, acc.getEmail());
            preparedStmt.setString(4, acc.getPhone());
            preparedStmt.setString(5, acc.getAddress());
            preparedStmt.setString(6, acc.getCity());
            preparedStmt.setInt(7, acc.getAccountID());
            preparedStmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Account updated!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{}
    }

   // pass in account object??
   public static void updateAccount(int id, int bal) throws Exception
   {
        try{
            Connection con = getConnection();
            
            String query = "update account set balance = ? where accountID = ?";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, bal);
            preparedStmt.setInt(2, id);
            preparedStmt.executeUpdate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{}
    }
   
   public static Account fetch(int id){
        
        Account ac = new Account();
        
        try{
            Connection conn = DBMethods.getConnection();
         
            String query ="select accountID, firstname, lastname, email, phoneNumber,"
                    + "address, city, accountNumber, sortCode, balance,"
                    + "overdraftLimit from account where accountID= ?";
                
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
                
            ResultSet rs = statement.executeQuery();
            if (rs.next())
            {
                ac.setAccountID(rs.getInt("accountID"));
                ac.setFirstName(rs.getString("firstname"));
                ac.setLastName(rs.getString("lastname"));
                ac.setEmail(rs.getString("email"));
                ac.setPhone(rs.getString("phoneNumber"));
                ac.setAddress(rs.getString("address"));
                ac.setCity(rs.getString("city"));
                ac.setAccountNumber(rs.getInt("accountNumber"));
                ac.setSortCode(rs.getInt("sortCode"));
                ac.setBalance(rs.getInt("balance"));
                ac.setOverdraftLimit(rs.getInt("overdraftLimit"));                
            }    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return ac;
    }


    public static Account fetch(int bankAcc, int sortCde){
        
        Account acc = new Account();
        
        try{
            Connection conn = DBMethods.getConnection();
         
            String query ="select accountID, firstname, lastname, email, phoneNumber,"
                    + "address, city, accountNumber, sortCode, balance,"
                    + "overdraftLimit from account where accountNumber = ? and sortCode = ?";
                
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, bankAcc);
            statement.setInt(2, sortCde);
                
            ResultSet rs = statement.executeQuery();
            if (rs.next())
            {
                acc.setAccountID(rs.getInt("accountID"));
                acc.setFirstName(rs.getString("firstname"));
                acc.setLastName(rs.getString("lastname"));
                acc.setEmail(rs.getString("email"));
                acc.setPhone(rs.getString("phoneNumber"));
                acc.setAddress(rs.getString("address"));
                acc.setCity(rs.getString("city"));
                acc.setAccountNumber(rs.getInt("accountNumber"));
                acc.setSortCode(rs.getInt("sortCode"));
                acc.setBalance(rs.getInt("balance"));
                acc.setOverdraftLimit(rs.getInt("overdraftLimit"));                
            }    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return acc;
    }
    
    public static void insertTransaction(Transaction trans) throws Exception
    {
        try{
            Connection con = getConnection();
            
            String query = "insert into transaction values (?,?,?,?,?,?,?,?)";
            
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, 0);
            preparedStmt.setInt(2, trans.getSortCode());
            preparedStmt.setInt(3, trans.getAccountNumber());
            preparedStmt.setString(4, trans.getDescription());
            preparedStmt.setDouble(5, trans.getCreditAmount());
            preparedStmt.setDouble(6, trans.getDebitAmount());
            preparedStmt.setDouble(7, trans.getBalance());
            String transTime = createMySQLTimestamp(trans.getDatetime());
            preparedStmt.setString(8, transTime);
            preparedStmt.executeUpdate();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error: Transasction not created! - " + ex);
        }
        finally{}
    }

    public static String createMySQLTimestamp(Date dt) {
        
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");

        String currentTime = sdf.format(dt);
        return currentTime;

    }
    
    
}
