class Account(n:Int,b:Double){
        val accNo:Int=n
        var balance:Double=b

        def transfer(a:Account,amount:Double)={
            this.balance=this.balance-amount
            a.balance=a.balance+amount
        }
}

object Q3{
    def main(args:Array[String])={
        val a1=new Account(123456,2500)
        val a2=new Account(230900,5000)
        a1.transfer(a2,2000)
        println(a1.balance)
        println(a2.balance)
    }
}