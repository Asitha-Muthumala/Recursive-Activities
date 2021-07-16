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

    def primeSeq(n: Int) : Unit={

        var a = 0
        print("Prime Sequence : ");
        for( a <- 2 to n){
            if(prime(a)){
                print(a+" ")
            }
        }

    }

    def main(args: Array[String]){
        primeSeq(40)
    }
}