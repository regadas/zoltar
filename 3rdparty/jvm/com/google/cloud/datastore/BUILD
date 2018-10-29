load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "datastore_v1_proto_client",
    exports = [
        "//3rdparty/jvm/com/google/api_client:google_api_client",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/http_client:google_http_client",
        "//3rdparty/jvm/com/google/http_client:google_http_client_jackson",
        "//3rdparty/jvm/com/google/http_client:google_http_client_protobuf",
        "//3rdparty/jvm/com/google/oauth_client:google_oauth_client",
        "//external:jar/com/google/cloud/datastore/datastore_v1_proto_client",
        ":datastore_v1_protos"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "datastore_v1_protos",
    exports = [
        "//3rdparty/jvm/com/google/api/grpc:grpc_google_common_protos",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//external:jar/com/google/cloud/datastore/datastore_v1_protos"
    ],
    visibility = [
        "//visibility:public"
    ]
)


