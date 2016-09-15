package arunwongcar

class Payment {

    String paymentId
    int amount
    Date datePaid
    String method
    String bank
    static belongsTo = [member:Member]
    static mapping = {
        posts sort:'datePaid'
    }

    static constraints = {
      paymentId()
      amount()
      datePaid()
      method()
      bank()
    }
}
