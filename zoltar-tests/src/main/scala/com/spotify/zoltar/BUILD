load("@io_bazel_rules_scala//scala:scala.bzl", "scala_macro_library")

scala_library(
    name = "zoltar",
    srcs = glob(["Iris.scala"]),
    deps = [
      "//3rdparty/jvm/com/spotify:scio_core",
      "//3rdparty/jvm/com/spotify:scio_bigquery",
      "//3rdparty/jvm/com/spotify:scio_tensorflow",
      "//3rdparty/jvm/com/spotify:featran_scio",
      "//3rdparty/jvm/com/spotify:featran_tensorflow",
      "//3rdparty/jvm/org/tensorflow:proto",
      ":iris_bq"
      ],
      exports = [
        ":iris_bq"
      ],
    visibility = ["//visibility:public"])

bigquery_schema(
    name = "iris_bq",
    srcs = ["Tables.scala"],
    visibility = ["//zoltar-tests:__subpackages__"]
)