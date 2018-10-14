object ins {
	def main(args:Array[String]): Unit = {
		def insert(lst:List[Int], x: Int): List[Int] = {
			lst match {
				case Nil => List(x)
				case hd::tail if hd>=x => List(x):::hd::tail
				case hd::tail if hd<x => hd::insert(tail,x)
				}
		}
	Console.println(insert(List(1,3,6,7,10), 5))
	}
}