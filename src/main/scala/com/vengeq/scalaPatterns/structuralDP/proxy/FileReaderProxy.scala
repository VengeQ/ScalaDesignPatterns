package com.vengeq.scalaPatterns.structuralDP.proxy

class FileReaderProxy(filename: String) extends FileReader {

  private lazy val fileReader2:FileReaderReal = new FileReaderReal(filename)
  override def readFileContents(): String =fileReader2.readFileContents()

}