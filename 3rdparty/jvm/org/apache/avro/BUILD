load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "avro",
    exports = [
        "//3rdparty/jvm/com/thoughtworks/paranamer:paranamer",
        "//3rdparty/jvm/org/apache/commons:commons_compress",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/tukaani:xz",
        "//3rdparty/jvm/org/xerial/snappy:snappy_java",
        "//external:jar/org/apache/avro/avro"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "avro_compiler",
    exports = [
        "//3rdparty/jvm/commons_lang:commons_lang",
        "//3rdparty/jvm/joda_time:joda_time",
        "//3rdparty/jvm/org/apache/velocity:velocity",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/avro/avro_compiler",
        ":avro"
    ],
    visibility = [
        "//visibility:public"
    ]
)


