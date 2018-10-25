load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "google_cloud_core",
    exports = [
        "//3rdparty/jvm/com/google/api/grpc:proto_google_common_protos",
        "//3rdparty/jvm/com/google/api/grpc:proto_google_iam_v1",
        "//3rdparty/jvm/com/google/api:api_common",
        "//3rdparty/jvm/com/google/api:gax",
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/http_client:google_http_client",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java_util",
        "//3rdparty/jvm/joda_time:joda_time",
        "//external:jar/com/google/cloud/google_cloud_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "google_cloud_core_grpc",
    exports = [
        "//3rdparty/jvm/com/google/api:gax_grpc",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java_util",
        "//3rdparty/jvm/io/grpc:grpc_protobuf",
        "//external:jar/com/google/cloud/google_cloud_core_grpc"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "google_cloud_core_http",
    exports = [
        "//3rdparty/jvm/com/google/api:gax_httpjson",
        "//3rdparty/jvm/com/google/api_client:google_api_client",
        "//3rdparty/jvm/com/google/auth:google_auth_library_credentials",
        "//3rdparty/jvm/com/google/auth:google_auth_library_oauth2_http",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/http_client:google_http_client",
        "//3rdparty/jvm/com/google/http_client:google_http_client_appengine",
        "//3rdparty/jvm/com/google/http_client:google_http_client_jackson",
        "//3rdparty/jvm/com/google/http_client:google_http_client_jackson2",
        "//3rdparty/jvm/com/google/oauth_client:google_oauth_client",
        "//3rdparty/jvm/io/opencensus:opencensus_api",
        "//3rdparty/jvm/io/opencensus:opencensus_contrib_http_util",
        "//external:jar/com/google/cloud/google_cloud_core_http",
        ":google_cloud_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "google_cloud_nio",
    exports = [
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/javax/inject:javax_inject",
        "//external:jar/com/google/cloud/google_cloud_nio",
        ":google_cloud_storage"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "google_cloud_storage",
    exports = [
        "//3rdparty/jvm/com/google/apis:google_api_services_storage",
        "//external:jar/com/google/cloud/google_cloud_storage",
        ":google_cloud_core",
        ":google_cloud_core_http"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


