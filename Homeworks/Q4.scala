object Q4 {
	def main(args: Array[String]){
		def insert (x: Int, sorted_lst:List[Int]) :List[Int] = sorted_lst match{
           case Nil => List(x)
           case y::ys => if  (x <= y) x::y::ys else y::insert(x,ys)
       }
		def InsertSort(lst: List[Int]): List[Int] = {
			lst match {
			case Nil => Nil
			case hd::tail => insert(hd,InsertSort(tail))
			}
		}
	Console.println("Unsorted (1,7,9,5,2,3,9,11) " + "Sorted -" + InsertSort(List(1,7,9,5,2,3,9,11)))   
	}
}