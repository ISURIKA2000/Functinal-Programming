import math.{sqrt,pow}

case class Point(a:Int,b:Int){
    def x:Int=a
    def y:Int=b

    // Q1
    def +(p:Point)=(this.x+p.x,this.y+p.y)

    // Q2
    def move(dx:Int,dy:Int)=(this.x+dx,this.y+dy)

    // Q3
    def distance(p:Point):Double=sqrt(pow((this.x-p.x),2)+pow((this.y-p.y),2))

    // Q4
    def invert()=(this.y,this.x)
}

object Q1{
    def main(args:Array[String]):Unit={
        val p1=Point(1,2)
        val p2=Point(2,4)

        println(p1+p2)
        println(p1.move(2,3))
        println(p1.distance(p2))
        println(p1.invert())
    }
}