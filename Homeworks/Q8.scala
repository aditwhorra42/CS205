

object Q8 {
	def main(args: Array[String]) {
		def Switch(x:Int, lst:List[Int]):List[List[Int]] = 
			lst match { 
			case Nil => List(List(x))
			case (hd::tail) => (x :: hd :: tail) :: Switch(x, tail).map(hd :: _)
			}
		def permutationsGen(lst1:List[Int]): List[List[Int]] = lst1 match {
			case Nil => List(List())
			case (hd::tail) => for(a <- permutationsGen(tail); a <- Switch(hd, a)) yield a
}
  
    var lst = List(1,2,3)
    println(permutationsGen(lst))
   
    }
    
    
   
  }
