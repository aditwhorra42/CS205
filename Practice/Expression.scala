class Expression
case class number(a: Int) extends Expression
case class Plus(a: Expression, b: Expression) extends Expression
case class Minus(a: Expression, b: Expression) extends Expression
case class Mult(a: Expression, b: Expression) extends Expression
case class Div(a: Expression, b: Expression) extends Expression

object a{
	def main(args: Array[String]): Unit = {
		def Eval(exp: Expression): Int = {
			exp match {
			case number(a) => a
			case Plus(a,b) => Eval(a) + Eval(b)
			case Minus(a,b) => Eval(a) - Eval(b)
			case Mult(a,b) => Eval(a) * Eval(b)
			case Div(a,b) => Eval(a) / Eval(b)
		}
	}
	var expr: Expression = Plus(Num(5),(Mult(Num(3),Num(4))))
	Console.println(Eval(expr))
	}
}
	