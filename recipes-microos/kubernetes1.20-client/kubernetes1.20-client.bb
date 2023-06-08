SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-client-1.20.15-2.1.aarch64.rpm"
RPM_HASH = "28e61c291242512a7ccfaa131478928f67b1ef2471fc383dc48b13c1ca283877469a1205a2c832d89032022eaea566767582a16e4c695817f61f35d198da3424"

RPROVIDES:${PN} += "kubernetes-client-provider kubernetes1.20-client kubernetes1.20-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes-client-common update-alternatives"

inherit rpm
