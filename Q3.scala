object recursive{

    def sumrange(n: Int) : Int= n match {
        case n if(n <= 1) => n
        case _ => n + sumrange(n-1)
    }

    def main(args: Array[String]){

        println("Addition of numbers of 1 to 5 : " + sumrange(5))

    }
}