SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-client-common-1.27.1-1.2.aarch64.rpm"
RPM_HASH = "fe4e853b9bf37bad4d26976873abe524e5b17dfebf0c10880f125950db681552558e1f5ce340de174b7dad72931a5167db5c68e0af84cdb32c2c19753bf533f0"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.27-client-common \
kubernetes1.27-client-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
kubernetes1.27-client"

inherit rpm
