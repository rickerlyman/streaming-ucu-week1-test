package week1

trait Expr
case class BinExpr(o:String,l:Expr,r:Expr) extends Expr
case class Constant(r:Rational) extends Expr
case class Inv(e:Expr) extends Expr

object Eval {

  def getOperator(e:Expr):String= {
    e match {
      case BinExpr(o,_,_) => o
      case _ => "No operator"
    }

    //  Define an eval(e:Expr):Rational function computing the value of any
  //  expression.

  def eval(e: Expr): Rational = {
    ???
  }

  val result = eval(BinExpr("+",Constant(new Rational(18,27)), Inv(Constant(new Rational(1,2)))))
  println(result)
}
