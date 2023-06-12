SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-apiserver-1.22.17-2.2.aarch64.rpm"
RPM_HASH = "94654e1a5762a3b636a1aadd1ee3cc3c9435e7ab72183a4d6f386726c0c1f6f0ef03ece880dc0235ac102ea7daf0dc7a8aa67d065a50d7f0fbb2c4f1409f35f8"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.22-apiserver \
kubernetes1.22-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
