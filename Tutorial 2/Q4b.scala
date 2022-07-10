import scala.io.StdIn.readInt

object Q3b{
    def attendance(ticketPrice:Int):Int=(120+20*((15-ticketPrice)/5))
    def income(ticketPrice:Int):Float=ticketPrice*attendance(ticketPrice:Int)
    def cost(ticketPrice:Int):Float=500+3*attendance(ticketPrice:Int)
    def profit(income:Float,cost:Float):Float=income-cost
    
    def main(args:Array[String])={
        println("Enter the ticket price")
        val ticketPrice=readInt()
        println(profit(income(ticketPrice),cost(ticketPrice)))
        var pre=0;
        var tp=10
        var best=0
        var profits=profit(tp)
        while(pre<profits){
            pre=profits
            best=tp;
            tp+=5
            profits=profit(tp)
        }
        println(best)

    }
    
}