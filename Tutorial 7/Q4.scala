class Account(n:Int,b:Double){
    val accNo:Int=n
    var balance:Double=b
    def interest()=this.balance match
        case x if x>0 =>this.balance+this.balance *0.05
        case x if x<0 => this.balance+this.balance * 0.1
        case _ => 0
    override def toString(): String = "["+this.accNo+":"+this.balance+"]"
        
}

class Bank(acc:List[Account]){
    var accounts:List[Account]=acc

    def negative()=accounts.filter(x =>x.balance<0)

    def sum()=accounts.map(x=>x.balance).sum
    
    def ApplyInterst()=accounts.map(x=>x.interest())
}

object Q4{

    def main(args:Array[String])={
        val a1=new Account(123456,5000)
        val a2=new Account(289653,7000)
        val a3=new Account(100820,-200)
        val a4=new Account(101380,10000)

        val bank = new Bank(List(a1,a2,a3,a4))

        val o=bank.negative()
        val t=bank.sum()
        val i=bank.ApplyInterst()

        println(o)
        println(t)
        println(i)
    }
}