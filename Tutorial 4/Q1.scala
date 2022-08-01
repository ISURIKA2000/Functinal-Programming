import scala.io.StdIn.readInt

object bank {
    def interest(m:Int):Double=m match{
        case x if(x<=20000)=>x*0.02
        
        case x if(x<=200000)=>x*0.04
        
        case x if(x<2000000)=>x*0.035
    
        case _ =>m*0.06
    }
    def main(args:Array[String])={
        println("Enter the amount of deposited money:")
        val m=readInt()
        println(interest(m))
    }
    
}