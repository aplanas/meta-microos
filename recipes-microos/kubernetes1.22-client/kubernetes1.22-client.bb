SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-client-1.22.17-2.1.aarch64.rpm"
RPM_HASH = "321e0baca2be1a2958b8d046ab6d9668bc2a647f09bbce0000fd705ecb799283ae3231207ece26db1f4c48ee71a36f8e33c7e6a6bbc4f7355d7c301f945f9eb6"

RPROVIDES:${PN} += "kubernetes-client-provider kubernetes1.22-client kubernetes1.22-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes-client-common update-alternatives"

inherit rpm
