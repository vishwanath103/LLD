package DesignSplitwise.Expense.Split;

import DesignSplitwise.User.User;

public class Split {
    User user;
    double amountOwe;

    public Split(User user, double amountOwe){
        this.user = user;
        this.amountOwe = amountOwe;
    }

    public User getUser(){
        return this.user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public double getAmountOwe(){
        return this.amountOwe;
    }

    public void setAmountOwe(double amountOwe){
        this.amountOwe = amountOwe;
    }
}
