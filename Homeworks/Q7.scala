object Q7 {
	def main(args: Array[String]): Unit = {
		var res:Int=1; 
		def fastPower( x:Int , n:Int): Int={ 
		if(n==0) return res
		else if(n%2==0)
		{ 
			res = fastPower(x,n/2);
			return (res*res) 
		}
		else
		{
			return ( x* fastPower(x,n-1))
		}
	}
	Console.println(fastPower(2,5))
}
}