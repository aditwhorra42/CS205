object Q2{
	def main(args: Array[String]){}
		def Split(lst: List[Int]): (List[Int], List[Int])= {	
		lst match{
			case Nil => (Nil, Nil)
			case hd::tail if lst.length==1 => (List(hd), Nil) 
			case hd::tail if lst.length>1 => (hd::Split(tail.init)._1, Split(tail.init)._2:::List(lst.last))
		}
		}
		Console.println("Splitting (1,2,3,4)" + Split(List(1,2,3,4)))
}