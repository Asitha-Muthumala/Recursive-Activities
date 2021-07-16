object recursive{

    def isEven(n:Int):Boolean= n match{
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean = !(isEven(n))

    def main(args: Array[String]){
       println("Is 5 even ? " + isEven(5))
       println("Is 8 even ? " + isEven(8))
    }
}