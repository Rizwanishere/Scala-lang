package day3

object ExtractorObj extends App {
  // Extractor objects are used to decompose objects in Scala through pattern matching.
  // They provide a mechanism to extract values from an object.
  // Apply method: Creates an object, often used in companion objects to simplify object construction.
  // Unapply method: Extracts the values from an object, which makes pattern matching possible.
  object Email {
    // apply method to construct an Email address from user and domain
    def apply(user: String, domain: String): String = s"$user@$domain"

    // unapply method to extract the user and domain from an email string
    def unapply(email: String): Option[(String, String)] = {
      val parts = email.split("@")
      if (parts.length == 2) Some(parts(0), parts(1)) else None
    }
  }

  //Usage with pattern matching
  val emailAddress = "syedrizwanali993@gmail.com"

  emailAddress match {
    case Email(user, domain) => println(s"User: $user, Domain: $domain")
    case _ => println("Not a valid email")
  }
}
