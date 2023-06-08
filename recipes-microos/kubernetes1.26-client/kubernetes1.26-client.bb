SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-client-1.26.4-1.1.aarch64.rpm"
RPM_HASH = "5f872b13218e1c4b3c0048f657c6fa0ce53ec443a41546bedb3a1c5962ed08cc2f65588ac2a3d5b314474b26d82242631bac176ebd5617e5c4f8b8964ca917c6"

RPROVIDES:${PN} += "kubernetes-client-provider kubernetes1.26-client kubernetes1.26-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes-client-common update-alternatives"

inherit rpm
