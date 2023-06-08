SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-apiserver-1.23.17-3.1.aarch64.rpm"
RPM_HASH = "98af4029290dd8bef25fd5fc2a1e481f68174e0162c172b00a2bdf1a7afdbd234360f33ce642a29305e8aa453a99d2f0e5182c5a3fa7e754c1c30307887ed9b5"

RPROVIDES:${PN} += "kubernetes-apiserver-provider kubernetes1.23-apiserver kubernetes1.23-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
