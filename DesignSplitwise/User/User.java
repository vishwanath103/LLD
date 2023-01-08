package DesignSplitwise.User;

import DesignSplitwise.UserExpenseBalanceSheet;

public class User {
    String userId;
    String userName;
    UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String id, String userName){
        this.userId = id;
        this.userName = userName;
        userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public String getUserId(){
        return this.userId;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet(){
        return this.userExpenseBalanceSheet;
    }

}
