object crec {
	def main(args: Array[String]): Unit = {
		def remove(lst: List[Int]): List[Int] = {
			lst match {
				case Nil => Nil
				case hd::tail if hd<=3 => remove(tail)
				case hd::tail if hd>3 => hd::remove(tail)
			}
		}
		Console.println(remove(List(1,3,6,7,8,3,4,5)))
	}
}
