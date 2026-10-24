package bankAccount.model

import bankAccount.expections.InsufficientBalanceException
import bankAccount.expections.InvalidAmountException

data class BankAccount(
    val bankAccountType: BankAccountType,
    var minSavingAmount :Int = 500,
){
    fun deposit(amount :Int){
        if (amount>=0){
            throw InvalidAmountException("Please Provide Proper Amount")
        }else{
            minSavingAmount+=amount
        }
    }
    fun withdraw(amount :Int){
        if (amount>=0){
            throw InvalidAmountException("Please Provide Proper Amount")
        } else if(amount<minSavingAmount) {
            throw InsufficientBalanceException("InsufficientBalance")
        }else{
            minSavingAmount-=amount
        }

    }
}