package io.kzonix.gitea.core.dto

trait ReplaceableOption[V] {
  def key: String

  def value: V
}


case class Value[V](key: String, value: V) extends ReplaceableOption[V] {

}
