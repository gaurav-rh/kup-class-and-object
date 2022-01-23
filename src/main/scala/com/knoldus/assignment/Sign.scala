package com.knoldus.assignment

trait Sign {
  def isPositive: Boolean

  def negate: Sign
}
