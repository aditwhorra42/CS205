class Tree
case class EmptyTree() extends Tree
case class NodeTree(data: Int, left: Tree, right: Tree) extends Tree

object j{
	def main(args: Array[String]): Unit = {
		def FoldTree(tree: Tree, f: (Int,Int)=>Int, init: Int): Int = {
			tree match { 
				case EmptyTree() => init
				case NodeTree(x: Int, left: Tree, right: Tree) => FoldTree(right, f, FoldTree(left, f(init,x), f))
			}
		}
	}
}