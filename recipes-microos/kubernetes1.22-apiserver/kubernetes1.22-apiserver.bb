SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-apiserver-1.22.17-2.1.aarch64.rpm"
RPM_HASH = "a3e52f89c041d7573b3c592c5cb86b0c074a54a3e5eeaf632f46b7a7ac836750f5ff1ea105150fb0510a25ee4b3d8d389159a2dbd0b8f11aa0ed8c6d5c635bd3"

RPROVIDES:${PN} += "kubernetes-apiserver-provider kubernetes1.22-apiserver kubernetes1.22-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
