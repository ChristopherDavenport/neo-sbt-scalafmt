package com.lucidchart.sbt.scalafmt

import sbt.{Configuration, ProjectRef, file}

object SbtUtil {

  def display(project: ProjectRef, configuration: Configuration) = {
    val ProjectRef(uri, id) = project
    val build = if (uri == file("").toURI) "" else s"{$uri}/"
    s"$build$id:$configuration"
  }

}