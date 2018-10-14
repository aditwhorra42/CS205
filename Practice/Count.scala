object Q {
	def main(args: Array[String]): Unit = {
		def insert(lst: List[Int], x: Int): List[Int] = {
			lst match {
				case Nil => List(x)
				case hd::tail if hd>=x => x::lst
				case hd::tail if hd<x => hd::insert(tail,x)
			}
		}
		def insertionSort(lst: List[Int], count: Int): (List[Int], Int) = {
			lst match {
				case Nil => (Nil,0)
				case hd::tail => insert(insertionSort(tail, count+1), hd)
				}
			}
		Console.println(insertionSort(List(5,4,3,2,1), 0)._2) 	
		}
	}
	