package com.typesafe.abide.rules

import scala.tools.abide.Context
import scala.tools.abide.traversal.ExistentialRule

class UnusedPrivate(val context: Context) extends ExistentialRule {
  import context.universe._

  type Key = Symbol
  val name = "UnusedPrivate"

  case class Warning(pos: Position, message: String, method: Symbol) extends RuleWarning

  def closedWorld(sym: Symbol) = sym.isPrivate || sym.isLocal
  val step = optimize {
    // TODO other variations...
    case tree @ q"$qual.$method[..$tps](..$args)" if closedWorld(tree.symbol) => ok(tree.symbol)
    case tree @ q"$mods def $method[..$tps](..$args): $tpt = $rhs" if closedWorld(tree.symbol) =>
      nok(tree.symbol, Warning(tree.pos, s"Unused member $method", tree.symbol))
  }
}