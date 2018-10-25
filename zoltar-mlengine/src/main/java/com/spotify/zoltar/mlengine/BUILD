package(default_visibility = ["//visibility:public"])

java_library(
    name = "mlengine",
    srcs = glob(["**/*.java"]),
    deps = [
        "//zoltar-core",
        "//zoltar-tensorflow",
        "//3rdparty/jvm/org/tensorflow:proto",
        "//3rdparty/jvm/com/google/apis:google_api_services_ml",
        "//3rdparty/jvm/com/google/api_client:google_api_client",
        "//3rdparty/jvm/com/google/http_client:google_http_client",
        "//3rdparty/jvm/com/google/oauth_client:google_oauth_client",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//3rdparty/jvm/com/google/auto/value:auto_value",
        "//3rdparty/jvm/com/google/guava:guava"
        ],
)