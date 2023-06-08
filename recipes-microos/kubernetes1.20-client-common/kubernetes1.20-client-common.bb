SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-client-common-1.20.15-2.1.aarch64.rpm"
RPM_HASH = "56fbefb3a541e801bf491c307beacd50758631b228de1f45c7a953eb9f1299c8cb8eea084a520c2043388a41da2f1920b306268c2c50c4db635f86bd4f8fc524"

RPROVIDES:${PN} += "kubernetes-client-common kubernetes1.20-client-common kubernetes1.20-client-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh kubernetes1.20-client"

inherit rpm
