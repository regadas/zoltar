load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_macro_library")

def bigquery_schema(name, srcs=[], visibility=[]):
    scala_library(
        name = name,
        srcs = srcs,
        plugins = ["@org_scalamacros_paradise_2_11_12//jar"],
        deps = [
            "//3rdparty/jvm/com/spotify:scio_bigquery"
        ],
        visibility = visibility
    )
