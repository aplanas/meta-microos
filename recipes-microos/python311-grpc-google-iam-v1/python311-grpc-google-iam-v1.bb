SUMMARY = "GRPC library for the google-iam-v1 service"
DESCRIPTION = "GRPC library for the google-iam-v1 service"
LICENSE = "Apache-2.0"

PV = "0.12.4"

RPM_NAME = "python311-grpc-google-iam-v1-0.12.4-1.4.noarch.rpm"
RPM_HASH = "7e97afcbc8baa3de6a5cd75588915741243e0e2362e60419d90d68f62868cee658f66f7122e9f822d42fcdeab2bdc1a9cc126eef3af67fa0a2f1ce2be02f082f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(grpc-google-iam-v1) python311-grpc-google-iam-v1 python3dist(grpc-google-iam-v1)"
RDEPENDS:${PN} += "python(abi) python311-googleapis-common-protos python311-grpcio"

inherit rpm
