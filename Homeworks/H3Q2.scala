object H3Q2 {
	def main(args: Array[String]): Unit = {
		var s1 = new scala.collection.mutable.Stack[List[Int]] // mutable stack predefined in scala
		var s2 = new scala.collection.mutable.Stack[List[Int]] // mutable stack predefined in scala
		var orig: List[Int] = List(1,2,3,4,5) // initialized original list
		var lst1: List[Int] = Nil // initialized empty list
		var lst2: List[Int] = Nil // initialized empty list
		
		while(orig.length>0){	// iterative funtion that will run till length of original list in grater than 0
				if(orig.length==1) { // for lists with odd lengths
					lst1 = lst1:::orig // last element is added to first list
					s1.push(lst1) // pushed to stack
					orig = Nil // since it was the last element, original list is now Nil (Empty list)
				}
				else { // till the length is more than 1
				lst1 = lst1:::List(orig.head) // head is added to list1
				lst2 = orig.last::lst2 // last element is added to list2
				s1.push(lst1) // pushed list1 to stack1
				s2.push(lst2) // pushed list2 to stack2
				orig = orig.tail.init // removed first and last element from original list
				}
			}
			Console.println(s1.pop,s2.pop)
		}
	}