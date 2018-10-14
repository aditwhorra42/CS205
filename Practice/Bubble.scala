object bbl {
	def main(args: Array[String]): Unit = {
		def bubble(lst: List[Int]): List[Int] = {
			lst match {
				case Nil => Nil
				case hd::tail if hd<lst.last => hd::bubble(tail)
				case hd::tail if hd>=lst.last => bubble(tail:+hd)
			}
		}
		Console.println(bubble(List(5,3,6,1,3,8,4,2)))
	}
}