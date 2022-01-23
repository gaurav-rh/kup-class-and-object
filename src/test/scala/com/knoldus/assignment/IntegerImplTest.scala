package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class IntegerImplTest extends AnyFlatSpec {
  val zero: Zero.type = Zero
  val one = new IntegerSuccessor(zero)
  val two = new IntegerSuccessor(one)
  val three = new IntegerSuccessor(two)
  "Condition Predecessor" should "give predecessor of one is zero " in {
    assert(one.predecessor.isZero)
  }
  "Condition IntegerSuccessor  with  - " should "give IntegerSuccessor  of 2-1 " in {
    assert(!two.-(one).successor.isZero)
  }
  "Condition Successor" should "give IntegerSuccessor of zero" in {
    assert(!zero.successor.isZero)
  }
  "Condition Predecessor with  - " should "give predecessor of 1-0" in {
    assert(one.-(zero).predecessor.isZero)
  }
  "Condition Successor  with  + " should "give IntegerSuccessor  of 1+0 " in {
    assert(!one.+(zero).successor.isZero)
  }
  "Condition Predecessor and + " should "give predecessor of 3-2 " in {
    assert(three.-(two).predecessor.isZero)
  }
  "Condition Predecessor of one" should "give zero " in {
    assert(one.predecessor == zero)
  }
}


