SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-client-common-1.21.14-2.1.aarch64.rpm"
RPM_HASH = "94d87555a3342805b1c1261024110715b9eb5a190cadf7e707829f5ac271e1be6f8e324d9b99d2946a8e4206e22e6277e90f7ac1051d5d90803956eac18006e9"

RPROVIDES:${PN} += "kubernetes-client-common kubernetes1.21-client-common kubernetes1.21-client-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh kubernetes1.21-client"

inherit rpm
