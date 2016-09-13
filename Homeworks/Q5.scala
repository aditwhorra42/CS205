object Q5 {
	def main(args: Array[String]){
		def pivotSort(lst: List[Int], x: Int): List[Int] = {
			lst match {
				case Nil => x::lst
				case hd::tail => if(hd<=x){
					hd::pivotSort(tail, x)
					}
					else {
						pivotSort(tail, x) ::: List(hd)
						}
					
					}
		}
		Console.println("Adding 5 to (1,4,9,11,2)" + pivotSort(List(1,4,9,11,2), 5))
	}
}