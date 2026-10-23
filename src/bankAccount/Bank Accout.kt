package bankAccount

fun main(){
    System.out.println("Please Create Bank Account")
    System.out.println("Please Enter Name")
    val readCustomerName = readln()
    System.out.println("Please Enter Age")
    val readCustomerAge = readln()
    System.out.println("Please Add Intial Deposit Savings")
    val readCustomerSavings = readln()

    val bankAccount = BankAccount(
        readCustomerName,
        readCustomerAge,
        readCustomerSavings.toInt()
    )
   // bankAccount.deposit(readCustomerSavings.toInt())
    System.out.println("Intellij Bank Account Created Successfully,Thanks You")
    System.out.println("Do want WithDraw Amount")
    val readCustomerWithDraw = readln()
    bankAccount.withdraw(readCustomerWithDraw.toInt())
    System.out.println("Total Saving Amount Presented ${bankAccount.accountBalance} Thanks For Transaction")



}

data class BankAccount(
    val customerName :String,
    val customerAge :String,
    var accountBalance :Int
){
    fun deposit(amount :Int){
        accountBalance+=amount
    }
    fun withdraw(amount :Int){
        accountBalance-=amount
    }
}
