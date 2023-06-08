SUMMARY = "Status proto mapping for gRPC"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems. \
 \
This package implements the GRPC Python status proto mapping."
LICENSE = "Apache-2.0"

PV = "1.44.0"

RPM_NAME = "python310-grpcio-status-1.44.0-1.5.aarch64.rpm"
RPM_HASH = "643568cc5d90a4b3cc52f431c7305a03933687cbc0f57307b1e77d7aa9ff836042240cf145750625f53d49c1c85140b7647de20ee256ace108dcbf8643e8d8ce"

RPROVIDES:${PN} += "python3-grpcio-status python3.10dist(grpcio-status) python310-grpcio-status python310-grpcio-status(aarch-64) python3dist(grpcio-status)"
RDEPENDS:${PN} += "python(abi) python310-googleapis-common-protos python310-grpcio python310-protobuf"

inherit rpm
