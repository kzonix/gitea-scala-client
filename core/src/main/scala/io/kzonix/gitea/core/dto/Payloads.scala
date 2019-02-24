package io.kzonix.gitea.core.dto

object Payloads {

}

trait Payloads {
  def mapTo[S <: Payloads, T <: Payloads](source: S): T = ???
}

case class Organization(avatarUrl: Option[String],
                        description: Option[String],
                        fullName: Option[String],
                        id: Int,
                        location: Option[String],
                        userName: String,
                        webSite: Option[String])

object Organization {
  def apply(fullName: Option[String],
            id: Int,
            userName: String): Organization = new Organization(None, None, fullName, id, None, userName, None)
}

case class User(avatarUrl: Option[String],
                email: String,
                fullName: Option[String],
                id: Int,
                language: Option[String],
                login: String)

object User {
  def apply(email: String,
            fullName: Option[String],
            id: Int,
            login: String): User = new User(None, email, fullName, id, None, login)
}

case class CreateUserOption(email: String,
                            password: String,
                            fullName: Option[String],
                            loginName: Option[String],
                            sentNotify: Option[Boolean],
                            sourceId: Option[Int],
                            userName: String)

object CreateUserOption {
  def apply(email: String,
            password: String,
            userName: String): CreateUserOption =
    new CreateUserOption(
      email = email,
      password = password,
      userName = userName,
      fullName = None,
      loginName = None,
      sentNotify = Some(false),
      sourceId = None
    )

  def apply(email: String,
            password: String,
            fullName: Option[String],
            loginName: Option[String],
            userName: String): CreateUserOption =
    new CreateUserOption(
      email,
      password,
      fullName,
      loginName,
      None,
      None,
      userName
    )
}

