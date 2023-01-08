package DesignSplitwise.Expense.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit{
    
    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) {
        double amountShouldBePresent = totalAmount/splitList.size();
        for(Split split: splitList){
            if(split.getAmountOwe() != amountShouldBePresent){
                try {
                    throw new MyException("Invalid split amount");
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
