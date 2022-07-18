def main(args:Array[String])={
    def booksPrice(n:Int):Double=24.95*n
    def discount(p:Double):Double=p*0.4
    def shippingCost(n:Int):Double=3*n+(n-50)*0.75
    def wholeCost(n:Int):Double=booksPrice(n:Int)-discount(booksPrice(n:Int))+shippingCost(n:Int)
    
    println(wholeCost(60))
}