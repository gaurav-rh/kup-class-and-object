package com.knoldus.assignment

case class IntegerImpl(value: Nat, sign: Sign = Positive) extends Nat with Sign {
  def isZero: Boolean = value.isZero

  def predecessor: Nat =
    if (isZero) IntegerImpl(value.successor, Negative)
    else if (sign.isPositive) IntegerImpl(value.predecessor, sign)
    else IntegerImpl(value.successor, Negative)

  def successor: Nat =
    if (isZero) IntegerImpl(value.successor, Positive)
    else if (sign.isPositive) IntegerImpl(value.successor, sign)
    else IntegerImpl(value.predecessor, Negative)

  def +(that: Nat): Nat =
    if (isZero) that
    else if (sign.isPositive) this.predecessor + that.successor
    else this.successor + that.predecessor

  def -(that: Nat): Nat =
    if (that.isZero) this
    else that match {
      case IntegerImpl(v, s) => this + IntegerImpl(v, s.negate)
    }

  def isPositive: Boolean = sign.isPositive

  def negate: IntegerImpl = IntegerImpl(value, sign.negate)

}

