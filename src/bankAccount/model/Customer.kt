package bankAccount.model

data class Customer(
    val customerName :String,
    val age :Int,
    val customerAccountNumber :Long,
    val bankAccountCreatedOn :String,
    val bankAccountType : BankAccountType,
){
    fun getCustomerDetails(): Customer{
        return Customer(customerName,age,customerAccountNumber,bankAccountCreatedOn,bankAccountType)
    }
}