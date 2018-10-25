package(default_visibility = ["//visibility:public"])

java_library(
    name = "tf",
    srcs = glob(["*.java"]),
    deps = [
        "//zoltar-core",
#        "//3rdparty/jvm/org/tensorflow:tensorflow",
        "//3rdparty/jvm/org/tensorflow:libtensorflow",
        "//3rdparty/jvm/org/tensorflow:libtensorflow_jni",
        "//3rdparty/jvm/org/tensorflow:proto",
        "//3rdparty/jvm/com/google/auto/value:auto_value",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/spotify:completable_futures",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/com/google/code/findbugs:jsr305"
        ],
)