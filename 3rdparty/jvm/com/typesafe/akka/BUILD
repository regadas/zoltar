load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
scala_import(
    name = "akka_actor",
    exports = [
        "//3rdparty/jvm/com/typesafe:config",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/com/typesafe/akka/akka_actor_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


