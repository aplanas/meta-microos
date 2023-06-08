SUMMARY = "Source code of gRPC"
DESCRIPTION = "This subpackage contains source code of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.54.1"

RPM_NAME = "grpc-source-1.54.1-1.1.noarch.rpm"
RPM_HASH = "ce7bcb7f04897e37e36d66db07d5e670cac707d0459ec5523d8d9a29d0d43bb09a7e8fdffa12aad6461c95f16b9c4143fe66bca6e94105bcbceb9699e2e90c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grpc-source"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env /usr/bin/python /usr/bin/python3"

inherit rpm
