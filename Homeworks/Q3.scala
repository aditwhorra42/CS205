object Q3{
		def main(args: Array[String]) {
			def insert(lst: List[Int]): List[Int] =
			lst match{
			case Nil => 5::lst
			case hd::tail => if(hd>=5){
				5::lst
				}
				else{
					hd::insert(tail)
				}
			}
	Console.println("Inserting 5 to (3,4,6,7) - " + insert(List(3,4,6,7)))
	
	}
}

