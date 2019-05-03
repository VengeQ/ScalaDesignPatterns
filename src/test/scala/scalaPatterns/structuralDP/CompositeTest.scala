package com.vengeq.scalaPatterns.structuralDP

import com.vengeq.scalaPatterns.structuralDP.composite._
import org.scalatest.FunSuite

class CompositeTest extends FunSuite{
  test("Composite test"){
    val tree = new Tree
    tree.add(new Leaf("leaf 1"))
    val subtree1 = new Tree
    subtree1.add(new Leaf("leaf 2"))
    val subtree2 = new Tree
    subtree2.add(new Leaf("leaf 3"))
    subtree2.add(new Leaf("leaf 4"))
    subtree1.add(subtree2)
    tree.add(subtree1)
    val subtree3 = new Tree
    val subtree4 = new Tree
    subtree4.add(new Leaf("leaf 5"))
    subtree4.add(new Leaf("leaf 6"))
    subtree3.add(subtree4)
    tree.add(subtree3)
    tree.print("-")
  }
}
