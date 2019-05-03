package com.vengeq.scalaPatterns.structuralDP.bridge

abstract class PasswordConverter(hasher: Hasher) {
  def convert(password: String): String
}

class SimplePasswordConverter(hasher: Hasher) extends PasswordConverter(hasher) {
  override def convert(password: String): String = hasher.hash(password)
}
class SaltedPasswordConverter(salt: String, hasher: Hasher) extends PasswordConverter(hasher) {
  override def convert(password: String): String = hasher.hash(s"${salt}:${password}")
}