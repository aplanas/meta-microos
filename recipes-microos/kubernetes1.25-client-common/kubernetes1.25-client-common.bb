SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-client-common-1.25.9-1.1.aarch64.rpm"
RPM_HASH = "2fc68f33375c9dc9157b91925f0db3dd8e145b647e93a3c3aed62fdd56b7e19798de70a02eebcf22c4a78bce18a4d565905f161a9eb66848047f3a080dc84b7a"

RPROVIDES:${PN} += "kubernetes-client-common kubernetes1.25-client-common kubernetes1.25-client-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh kubernetes1.25-client"

inherit rpm
