package com.vengeq.scalaPatterns.structuralDP

import com.vengeq.scalaPatterns.structuralDP.proxy.{FileReaderProxy, FileReaderReal}
import org.scalatest.FunSuite

class ProxyTest extends FunSuite{
  test("Proxy Test"){
    val fileMap = Map(
      "file1.txt" -> new FileReaderProxy("/file1.txt"),
      "file2.txt" -> new FileReaderProxy("/file2.txt"),
      "file3.txt" -> new FileReaderProxy("/file3.txt"),
      "file4.txt" -> new FileReaderReal("/file1.txt")
    )
    System.out.println("Created the map. You should have seen file1.txt read because it wasn't used in a proxy.")
    System.out.println(s"Reading file1.txt from the proxy: ${fileMap("file1.txt").readFileContents()}")
    System.out.println(s"Reading file3.txt from the proxy: ${fileMap("file3.txt").readFileContents()}")
  }
}
