package com.vengeq.scalaPatterns.behavioralDP

import com.vengeq.scalaPatterns.behavioralDP.memento.TextEditorManipulator
import org.scalatest.FunSuite

class MementoTest extends FunSuite{
  test("Memento test"){
    val textEditorManipulator = new TextEditorManipulator
    textEditorManipulator.append("This is a chapter about memento.")
    System.out.println(s"The text is: '${textEditorManipulator.readText()}'")
    // delete 2 characters
    System.out.println("Deleting 2 characters...")
    textEditorManipulator.delete()
    textEditorManipulator.delete()
    // see the text
    System.out.println(s"The text is: '${textEditorManipulator.readText()}'")
    // undo
    System.out.println("Undoing...")
    textEditorManipulator.undo()
    System.out.println(s"The text is: '${textEditorManipulator.readText()}'")
    // undo again
    System.out.println("Undoing...")
    textEditorManipulator.undo()
    System.out.println(s"The text is: '${textEditorManipulator.readText()}'")


    val textEditorManipulator2=new TextEditorManipulator
    textEditorManipulator2.append("1")
    textEditorManipulator2.delete()
    textEditorManipulator2.undo()
    textEditorManipulator2.undo()
    textEditorManipulator2.undo()
  }
}
