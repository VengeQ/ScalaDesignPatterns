package com.vengeq.scalaPatterns.behavioralDP.memento

class TextEditorManipulator extends Caretaker[String] {
  private val textEditor = new TextEditor
  def save(): Unit = {
    states=textEditor.createMemento::states
  }
  def undo(): Unit = {
    states match {
      case Nil => Unit
      case x::xs =>
        textEditor.restore(x)
        states=xs
    }

  }
  def append(text: String): Unit = {
    save()
    textEditor.append(text)
  }
  def delete(): Unit = {
    save()
    textEditor.delete()
  }
  def readText(): String = textEditor.text()
}