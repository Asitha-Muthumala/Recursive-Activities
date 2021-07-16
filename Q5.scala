object recursive{

    def isEven(n: Int) : Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n: Int) : Boolean = !(isEven(n))

    def evenSum(num: Int) : Int={

        if (num <= 1){

            return 0

        }
        else
        {

            if(!isEven(num)){
                return evenSum(num - 1)
            }
            else
            {
                return num + evenSum(num - 1)
            }

        }
    }

    def main(args: Array[String]){

        println("The even numbers sum of 0-20 range : " + evenSum(20))

    }

}