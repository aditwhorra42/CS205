object H3Q2 {
	def main(args: Array[String]): Unit = {
		var s1 = new scala.collection.mutable.Stack[List[Int]]
		var s2 = new scala.collection.mutable.Stack[List[Int]]
		var orig: List[Int] = List(1,2,3,4,5)
		var lst1: List[Int] = Nil
		var lst2: List[Int] = Nil
		
		while(orig.length>0){	
				if(orig.length==1) {
					lst1 = lst1:::orig
					s1.push(lst1)
					orig = Nil
				}
				else {
				lst1 = lst1:::List(orig.head)
				lst2 = orig.last::lst2
				s1.push(lst1)
				s2.push(lst2)
				orig = orig.tail.init
				}
			}
			Console.println(s1.pop,s2.pop)
		}
	}