object Q7{
	def main(args: Array[String]) {
	def fastPower(x: Int, n: Int): Int= //will work when n is a power of 2
	{
		n match{
			case 2 => x*x
			case n => if (n%2!=0){
			x*fastPower(x,(n-1)/2)*fastPower(x,(n-1)/2)}
			else{
			fastPower(x,n/2)*fastPower(x,n/2) }
		}
	}
	Console.println(fastPower(3,4))
}
}