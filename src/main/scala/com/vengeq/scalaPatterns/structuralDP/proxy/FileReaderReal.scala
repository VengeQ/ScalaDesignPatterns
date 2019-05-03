package com.vengeq.scalaPatterns.structuralDP.proxy

import java.io.{BufferedReader, InputStreamReader}
import scala.collection.JavaConverters._

class FileReaderReal(filename: String) extends FileReader {
  val contents = {
    val stream = this.getClass.getResourceAsStream(filename)
    val reader = new BufferedReader(new InputStreamReader(stream))
    try {
      reader.lines().iterator().asScala.mkString(System.getProperty("line.separator"))
    } finally {
      reader.close()
      stream.close()
    }
  }
  System.out.println(s"Finished reading the actual file: $filename")
  override def readFileContents(): String = contents
}