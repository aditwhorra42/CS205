object oe {
	def main(args:Array[String]) : Unit = {
		def pal(lst: List[Int]) : Int = {
			lst match {
				case hd::tail if lst.length==1 => 1
				case hd::tail if (hd!=lst.last) => 0
				case hd::tail if (hd==lst.last) => pal(tail.init)
			}
		}
		Console.println(pal(List(1,2,3,1,1,2,1)))
		}
}