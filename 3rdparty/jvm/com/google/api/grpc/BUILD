load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "grpc_google_cloud_pubsub_v1",
    exports = [
        "//3rdparty/jvm/io/grpc:grpc_protobuf",
        "//3rdparty/jvm/io/grpc:grpc_stub",
        "//external:jar/com/google/api/grpc/grpc_google_cloud_pubsub_v1",
        ":proto_google_cloud_pubsub_v1"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "grpc_google_common_protos",
    exports = [
        "//3rdparty/jvm/io/grpc:grpc_protobuf",
        "//3rdparty/jvm/io/grpc:grpc_stub",
        "//external:jar/com/google/api/grpc/grpc_google_common_protos",
        ":proto_google_common_protos"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "proto_google_cloud_pubsub_v1",
    exports = [
        "//3rdparty/jvm/com/google/api:api_common",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//external:jar/com/google/api/grpc/proto_google_cloud_pubsub_v1",
        ":proto_google_iam_v1"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "proto_google_common_protos",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//external:jar/com/google/api/grpc/proto_google_common_protos"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "proto_google_iam_v1",
    exports = [
        "//3rdparty/jvm/com/google/api:api_common",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//external:jar/com/google/api/grpc/proto_google_iam_v1",
        ":proto_google_common_protos"
    ],
    visibility = [
        "//visibility:public"
    ]
)


