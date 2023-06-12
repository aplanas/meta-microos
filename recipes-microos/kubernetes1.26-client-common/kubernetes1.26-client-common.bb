SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-client-common-1.26.4-1.2.aarch64.rpm"
RPM_HASH = "0aa51bf1b5d0298e82a0df2c916fa2208787569d487919ac5d2bca363bc598a2f758d63d53a151b094f07af53a216e2c7b50f418e3c1fde40e0a0ab94fce74bb"

RPROVIDES:${PN} += "kubernetes-client-common kubernetes1.26-client-common kubernetes1.26-client-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh kubernetes1.26-client"

inherit rpm
