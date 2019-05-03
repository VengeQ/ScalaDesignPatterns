package com.vengeq.scalaPatterns.structuralDP

import com.vengeq.scalaPatterns.structuralDP.adapter.Logger
import com.vengeq.scalaPatterns.structuralDP.bridge._
import org.scalatest.FunSuite

class BridgeTest extends FunSuite{

  test("Bridge test"){

    val p1 = new SimplePasswordConverter(new Sha256Hasher)
    val p2 = new SimplePasswordConverter(new Md5Hasher)
    val p3 = new SaltedPasswordConverter("8jsdf32T^$%", new Sha1Hasher)
    val p4 = new SaltedPasswordConverter("8jsdf32T^$%", new Sha256Hasher)
    System.out.println(s"'password' in SHA-256 is: ${p1.convert ("password")}")
    System.out.println(s"'1234567890' in MD5 is: ${p2.convert ("1234567890")}")
    System.out.println(s"'password' in salted SHA-1 is: ${p3.convert ("password")}")
    System.out.println(s"'password' in salted SHA-256 is: ${p4.convert ("password")}")
  }


  test("Scala bridge test"){
    val p1 = new SimplePasswordConverterScala with Sha256ScalaHasher
    val p2 = new SimplePasswordConverterScala with Md5ScalaHasher
    val p3 = new SaltedPasswordConverterScala("8jsdf32T^$%") with Sha1ScalaHasher
    val p4 = new SaltedPasswordConverterScala("8jsdf32T^$%") with Sha256ScalaHasher
    System.out.println(s"'password' in SHA-256 is: ${p1.convert("password")}")
    System.out.println(s"'1234567890' in MD5 is: ${p2.convert("1234567890")}")
    System.out.println(s"'password' in salted SHA-1 is: ${p3.convert("password")}")
    System.out.println(s"'password' in salted SHA-256 is: ${p4.convert("password")}")
  }


}
