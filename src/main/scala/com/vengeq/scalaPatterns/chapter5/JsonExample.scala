package com.vengeq.scalaPatterns.chapter5


case class Book(id:Long,title:String, authors:List[String], price:Double)

import org.json4s._
import org.json4s.jackson.JsonMethods._

class JsonExample {
  implicit val formats = DefaultFormats
  def books:List[Book]=parse(getClass.getResourceAsStream("/books.json")).extract[List[Book]]

  def showAuthor= books.foreach(book => println{
    s"${book.id}:${book.title} with authors '${book.authors.mkString(", ")}' have price ${book.price}"
  })

}
