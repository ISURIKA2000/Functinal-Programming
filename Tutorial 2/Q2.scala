var (a,b,c,d)=(2,3,4,5)
var (g,k)=(4.0f,4.3f)

object Q2{
    def main(args:Array[String])={
        b-=1
        println(b*a+c*d)
        d-=1
        println(a)
        a+=1
        println((-2)*(g-k)+c)
        println(c)
        c+=1
        c+=1
        c=c*a
        a+=1
        println(c)
    }
}