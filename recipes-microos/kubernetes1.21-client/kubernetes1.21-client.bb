SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-client-1.21.14-2.1.aarch64.rpm"
RPM_HASH = "0a825cdf5c3de34c18622c57b7a078eaedbd19db78d650f29a0f6a26531c0b20dbe9a286914a45c938a941109004cc27baedcaeb03cbe2b4819e4b51e6f85799"

RPROVIDES:${PN} += "kubernetes-client-provider kubernetes1.21-client kubernetes1.21-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes-client-common update-alternatives"

inherit rpm
