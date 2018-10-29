workspace(name = "com_spotify_zoltar")

rules_scala_version="f2647ed38afc845eb09cc656e7e98cc2b6b6f3d7" # update this as needed

http_archive(
    name = "io_bazel_rules_scala",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip" % rules_scala_version,
    type = "zip",
    strip_prefix= "rules_scala-%s" % rules_scala_version
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

load("//3rdparty:workspace.bzl", "maven_dependencies")

maven_dependencies()

#bind(name = 'io_bazel_rules_scala/dependency/scalatest/scalatest', actual = '//3rdparty/jvm/org/scalatest')