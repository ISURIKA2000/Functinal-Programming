class Rational(x:Int,y:Int){
        def numerator=x
        def denominator=y

        def neg=new Rational(-this.numerator,this.denominator)
}

object Q1{
    def main(args:Array[String])={
        val x=new Rational(1,3)
        val y=x.neg
        println(y.numerator+"/"+y.denominator)
    }
}
