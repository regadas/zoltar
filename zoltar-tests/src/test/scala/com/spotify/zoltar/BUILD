load("@io_bazel_rules_scala//scala:scala.bzl", "scala_test")

scala_test(
    name = "IrisTest",
    srcs = ["IrisTest.scala"],
    plugins = ["@org_scalamacros_paradise_2_11_12//jar"],
    resources = ["//zoltar-tests/src/test/resources"],
    deps = [
        "//3rdparty/jvm/com/spotify:scio_test",
        "//3rdparty/jvm/com/spotify:scio_tensorflow",
        "//zoltar-tests",
    ],
)