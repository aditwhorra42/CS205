class Tree
case class EmptyTree() extends Tree
case class NodeTree(data: Int, left: Tree, right: Tree) extends Tree

object exam {
	def main(args: Array[String]): Unit = {
		def MapTree(tree: Tree, f:Int => Int): Tree = {
			tree match {
				case EmptyTree() => EmptyTree() 
				case NodeTree(x: Int, left: Tree, right: Tree) => return NodeTree(f(x), MapTree(left,f), MapTree(right,f))
				}
			}
			var a : Tree = NodeTree(3,NodeTree(5,EmptyTree(), EmptyTree()), NodeTree(8,EmptyTree(), EmptyTree()))
			Consprintln(MapTree(a, x=>x*2))
		}
	}	