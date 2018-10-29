load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "api_common",
    exports = [
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/guava:guava",
        "//external:jar/com/google/api/api_common"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "gax",
    exports = [
        "//3rdparty/jvm/com/google/auth:google_auth_library_oauth2_http",
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/org/threeten:threetenbp",
        "//external:jar/com/google/api/gax",
        ":api_common"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "gax_grpc",
    exports = [
        "//3rdparty/jvm/com/google/auth:google_auth_library_credentials",
        "//3rdparty/jvm/com/google/auth:google_auth_library_oauth2_http",
        "//3rdparty/jvm/com/google/auto/value:auto_value",
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/io/grpc:grpc_auth",
        "//3rdparty/jvm/io/grpc:grpc_netty",
        "//3rdparty/jvm/io/grpc:grpc_protobuf",
        "//3rdparty/jvm/io/grpc:grpc_stub",
        "//3rdparty/jvm/org/threeten:threetenbp",
        "//external:jar/com/google/api/gax_grpc",
        ":api_common",
        ":gax"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "gax_httpjson",
    exports = [
        "//3rdparty/jvm/com/google/auth:google_auth_library_credentials",
        "//3rdparty/jvm/com/google/auth:google_auth_library_oauth2_http",
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/code/gson:gson",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/http_client:google_http_client",
        "//3rdparty/jvm/org/threeten:threetenbp",
        "//external:jar/com/google/api/gax_httpjson",
        ":api_common",
        ":gax"
    ],
    visibility = [
        "//visibility:public"
    ]
)


