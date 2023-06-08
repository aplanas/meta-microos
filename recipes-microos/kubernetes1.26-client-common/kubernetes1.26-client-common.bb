SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-client-common-1.26.4-1.1.aarch64.rpm"
RPM_HASH = "fb12c30b3b46beb1595fee0b467c2e65d5148cf27317c257c5372094ecdb9e05afd6daf634af608b095dd965d2a97be95465cec68ca64279bccbf4bc47fbdcf1"

RPROVIDES:${PN} += "kubernetes-client-common kubernetes1.26-client-common kubernetes1.26-client-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh kubernetes1.26-client"

inherit rpm
