SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-controller-manager-1.26.4-1.1.aarch64.rpm"
RPM_HASH = "85b5a802e831a9c9a4f42754d0b248454fadb7917e4af8bc4e21f75a75c9d476f00292812b2f421e401acb2fa6ea41cac60b9f16c291a234cbbcaa8500e7ba0b"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider kubernetes1.26-controller-manager kubernetes1.26-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
