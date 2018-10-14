class Tree
case class EmptyTree() extends Tree
case class NodeTree(data: Int, left: Tree, right: Tree) extends Tree

object exam{
	def main(args: Array[String]): Unit = {
		var a : Tree = new NodeTree(3,NodeTree(5,EmptyTree(), EmptyTree()), NodeTree(8,EmptyTree(), EmptyTree()))
			def d(tree: Tree): Tree = {
				tree match {
					case EmptyTree() => EmptyTree();
					case NodeTree(x: Int, left: Tree, right: Tree) => NodeTree(x*2,d(left), d(right));
				}
			}
			println(d(a))
		}
	}