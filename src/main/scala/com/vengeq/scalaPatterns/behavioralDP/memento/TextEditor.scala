package com.vengeq.scalaPatterns.behavioralDP.memento

class TextEditor extends Originator[String] {
  private var builder: StringBuilder = new StringBuilder
  def append(text: String): Unit = {
    builder.append(text)
  }
  def delete(): Unit = {
    if (builder.nonEmpty) {
      builder.deleteCharAt(builder.length - 1)
    }
  }
  override def createMemento: Memento[String] = new TextEditorMemento(builder.toString)

  override def restore(memento: Memento[String]): Unit = {
    this.builder = new StringBuilder(memento.getState())
  }

  def text(): String = builder.toString
  private class TextEditorMemento(val state: String) extends Memento[String]
}