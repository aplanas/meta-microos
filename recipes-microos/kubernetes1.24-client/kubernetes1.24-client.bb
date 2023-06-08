SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-client-1.24.13-2.1.aarch64.rpm"
RPM_HASH = "06589e569606b5cce8290f0e431a29f17491d52027a01c58486857389a9b58d19352355910d5d70956961f1c8d4575086ccc2a5462d211138d5ecc26e907131a"

RPROVIDES:${PN} += "kubernetes-client-provider kubernetes1.24-client kubernetes1.24-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes1.24-client-common update-alternatives"

inherit rpm
