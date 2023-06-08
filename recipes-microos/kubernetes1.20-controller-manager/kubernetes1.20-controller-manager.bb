SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-controller-manager-1.20.15-2.1.aarch64.rpm"
RPM_HASH = "967f1866a2b1a2c8e6b57509d5ddebb798ef4076999eb1e5e09cf8901b189e2623cc44e5c6042dde057709b57c2f98f6edf18b5a7ac07814d4bc7963ed93ffcd"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider kubernetes1.20-controller-manager kubernetes1.20-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
