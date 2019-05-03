package com.vengeq.scalaPatterns.structuralDP.bridge

import org.apache.commons.codec.binary.Hex


trait Sha1ScalaHasher extends Hasher {
  override def hash(data: String): String =
    new String(Hex.encodeHex(getDigest("SHA-1", data).digest()))
}
trait Sha256ScalaHasher extends Hasher {
  override def hash(data: String): String =
    new String(Hex.encodeHex(getDigest("SHA-256", data).digest()))
}

trait Md5ScalaHasher extends Hasher {
  override def hash(data: String): String =
    new String(Hex.encodeHex(getDigest("MD5", data).digest()))
}

