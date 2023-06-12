SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-client-common-1.22.17-2.2.aarch64.rpm"
RPM_HASH = "0e8ac27e866a4ef75e1d7f054158d0f94f6dfe4984447d049e43e154fe287bc34c20b642a9f680e53ee81fa1ee5296e8b9e867a8a9524c2f110f1fe0c55c9f4a"

RPROVIDES:${PN} += "kubernetes-client-common kubernetes1.22-client-common kubernetes1.22-client-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh kubernetes1.22-client"

inherit rpm
