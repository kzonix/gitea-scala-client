package io.kzonix.gitea.core.dto

trait RequestOption[R <: Payloads] {
  def requestParams: Seq[String]

  def requestParams(params: Seq[String]): RequestOption[R]

  def queryParams: Seq[String]

  def queryParams(params: Seq[String]): RequestOption[R]

  def requestType: RequestType

  def requestType(requestType: RequestType): RequestOption[R]

  def requestPayload: R

  def requestPayload(payload: R): RequestOption[R]
}
