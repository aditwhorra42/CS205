class Tree
case class EmptyTree() extends Tree
case class NodeTree(data: Int, left: Tree, right: Tree) extends Tree

object ex{
	def main(args: Array[String]): Unit = {
		def sum(tree: Tree): Int = { 
			tree match {
				case EmptyTree() => 0
				case NodeTree(x: Int, left:Tree, right:Tree) => x*x + sum(left) + sum(right)
				}
			}
			var a : Tree = NodeTree(3,NodeTree(5,EmptyTree(), EmptyTree()), NodeTree(8,EmptyTree(), EmptyTree()))
			Console.println(sum(a))
		}
	}