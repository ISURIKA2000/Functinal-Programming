class Rational(x:Int,y:Int){
        def numerator=x
        def denominator=y

        def neg=new Rational(-this.numerator,this.denominator)
        def +(r:Rational)=new Rational(this.numerator*r.denominator+r.numerator*this.denominator,denominator*r.denominator)
        def sub(r:Rational)=this+r.neg
    }
object Q2{
    def main(args:Array[String])={
        val x=new Rational(3,4)
        val y=new Rational(5,8)
        val z=new Rational(2,7)
        val finals=x+(y.neg)+(z.neg)
        println(finals.numerator+"/"+finals.denominator)
    }
}