SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-client-common-1.22.17-2.1.aarch64.rpm"
RPM_HASH = "3d0547b9d73345d343de674f5a4e50c312a4560db6d70b4a434506d940c4253239e56910098a96458a2741a809272568b3b1158a7868663beaefd743847b3771"

RPROVIDES:${PN} += "kubernetes-client-common kubernetes1.22-client-common kubernetes1.22-client-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh kubernetes1.22-client"

inherit rpm
