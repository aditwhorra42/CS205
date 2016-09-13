object Q1 {
	def main(args: Array[String]): Unit = {
		def fact(n: Int): Int = 
			n match {
			case 0 => 1
			case n => n*fact(n-1)}
			Console.println("Factorial of 5 is" + fact(5))	
	
	}
}