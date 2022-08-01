object names{
    def toUpper(s:String):String={
        s.toUpperCase()
    }
    def toLower(s:String):String={
        s.toLowerCase()
    }
    def formatNames(name:String,fun:String=>String)=fun(name)

    def main(args:Array[String]):Unit={
        println(formatNames("Benny",toUpper));
        println("N"+(formatNames("i",toUpper))+"rmal");
        println(formatNames("Saman",toLower));
        println("Kumar"+(formatNames("a",toUpper)));
    }
}
