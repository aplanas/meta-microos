SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-client-1.25.9-1.1.aarch64.rpm"
RPM_HASH = "1693457a2044e00e54c055106e9486ea9c58e9c8142723bbf21ad078ca37e27413a3e63598c407f7ec6a464c38883f2572e6cea3d63974586123e3c5059a32d5"

RPROVIDES:${PN} += "kubernetes-client-provider kubernetes1.25-client kubernetes1.25-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes-client-common update-alternatives"

inherit rpm
