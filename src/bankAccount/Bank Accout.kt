package bankAccount

import bankAccount.model.BankAccount
import bankAccount.model.BankAccountType

fun main() { 
    println("Welcome To Intellij Bank")
    println("Please Create Bank Account Do Want Create Account. Yes/No")
    val choice = readln()

    if (choice.equals("Yes", ignoreCase = true)) {
        println("Let's create your bank account.")
    } else {
        println("Account creation cancelled.")
    }

    println("Which bank account do you want to create?")
    println("1. Savings Account")
    println("2. Current Account")

    val accountChoice = readln()
    val accountType = when (accountChoice) {
        "1" -> BankAccountType.SAVINGS_ACCOUNT
        "2" -> BankAccountType.CURRENT_ACCOUNT
        else -> null
    }

    if (accountType != null) {
         val bankAccount = BankAccount(
            bankAccountType = accountType
        )

            println("Selected Account Type: $accountType")

            println("Before Creating Bank Account, Please Provide Necessary Details")

            println("Please Enter Name")
            val readCustomerName = readln()

            println("Please Enter Age")
            val readCustomerAge = readln().toInt()

            println("Please Add Initial Deposit Savings")
            val readCustomerSavings = readln().toInt()

            if (readCustomerSavings >= bankAccount.minSavingAmount) {
                bankAccount.minSavingAmount = readCustomerSavings
                println("Initial deposit successful: $readCustomerSavings")
                println("Customer Name: $readCustomerName")
                println("Customer Age: $readCustomerAge")
                println("Account Type: ${bankAccount.bankAccountType}")
                println("Initial Deposit: $readCustomerSavings")
            } else {
                println("Minimum deposit amount is ${bankAccount.minSavingAmount}")
            }
        } else {
            println("Invalid choice. Please select 1 or 2.")
        }

    println("Before Creating Bank Account Please Provide Necessary Details")

}

