/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.util.Date;

/**
 *
 * @author eamon
 */
public class Transaction {
    private int transasctionID;
    private String description;        
    private int sortCode;
    private int accountNumber;
    private double creditAmount;
    private double debitAmount;
    private double balance;
    private Date datetime;

    /**
     *
     * @return
     */
    public int getTransasctionID() {
        return this.transasctionID;
    }

    /**
     *
     * @param transasctionID
     */
    public void setTransasctionID(int transasctionID) {
        this.transasctionID = transasctionID;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return this.description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public double getCreditAmount() {
        return this.creditAmount;
    }

    /**
     *
     * @param creditAmount
     */
    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     *
     * @return
     */
    public double getDebitAmount() {
        return this.debitAmount;
    }

    /**
     *
     * @param debitAmount
     */
    public void setDebitAmount(double debitAmount) {
        this.debitAmount = debitAmount;
    }

    /**
     *
     * @return
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
   
    /**
     *
     * @return
     */
    public int getSortCode() {
        return this.sortCode;
    }

    /**
     *
     * @param sortCode
     */
    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    /**
     *
     * @return
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     *
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     *
     * @param datetime
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
      
}
