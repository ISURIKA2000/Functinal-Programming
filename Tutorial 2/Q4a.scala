import scala.io.StdIn.readInt

 object Q3a{
    def preSalary(normal:Int,ot:Int):Int=250*normal+85*ot
    def tax(normal:Int,ot:Int):Float=if(normal>=40 && ot>=30)0.12 else 0
    def finalSalary(preSalary:Int,tax:Float):Float=preSalary-preSalary*tax

    def main(args:Array[String])={
        println("Enter number of normal hours")
        val normal=readInt()
        println("Enter number of ot hours")
        val ot=readInt()
        println(finalSalary(preSalary(normal,ot),tax(normal,ot)))
    }
 }