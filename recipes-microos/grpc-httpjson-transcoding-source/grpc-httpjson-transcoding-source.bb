SUMMARY = "Source code of grpc-httpjson-transcoding"
DESCRIPTION = "Source code of grpc-httpjson-transcoding - a library that supports transcoding \
so that HTTP/JSON can be converted to gRPC. It allows to provide APIs in both \
gRPC and REST style at the same time."
LICENSE = "Apache-2.0"

PV = "20190920"

RPM_NAME = "grpc-httpjson-transcoding-source-20190920-2.9.noarch.rpm"
RPM_HASH = "8df458030c16a3fa0b6c9c8201ba3110b2584ab57ff27f8e422937475241b6d3f97ab1f0f06a863967f8ac5fd834be9d3689d01516e42bd5be9ad910508e28a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grpc-httpjson-transcoding-source"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
