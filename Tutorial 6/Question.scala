object caeser{
    def main(args:Array[String]):Unit={
        val a ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val s="ISURIKA"
        val m=cipher(E,s,5,a)
        val n=cipher(D,m,5,a)
        println(m)
        println(n)
        
    }

    val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
    val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
    val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
}
