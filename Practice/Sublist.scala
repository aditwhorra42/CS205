def isSublist(lst1: List[Int], lst2: List[Int], a): Boolean = {
	(lst1, ls2) match {
		case(Nil, Nil) => True
		case(hd:rest, Nil) => True
		case(Nil, hd2:rest2) => False
		case(hd:rest, hd2:rest2) => if(hd==hd2){
										a = 0;
										return isSublist(rest, rest2)}
									else if(hd!=hd2 && a=0) {
										return False }
											else{
												isSublist(tail, lst2)
												}
								}
					}