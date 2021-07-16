object recursive{

    def GCD(a: Int, b: Int) : Int = b match {
        case 0 => a
        case b if(b>a) => GCD(b, a)
        case _ => GCD(b, a%b)
    }

    def prime(n: Int, p: Int=2) : Boolean = p match {
        case x if(n == p) => true
        case x if(GCD(n,x))>1 => false
        case x => prime(n, x+1)

    }
    def main(args: Array[String]){
        println("Is 5 is a prime number ? " + prime(5))
        println("Is 8 is a prime number ? " + prime(8))
    }
}