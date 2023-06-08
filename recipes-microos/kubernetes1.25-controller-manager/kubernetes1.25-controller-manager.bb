SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-controller-manager-1.25.9-1.1.aarch64.rpm"
RPM_HASH = "5d3c3199825ff2445a4118f305e563068507bb2d50036edd8cfba293ceedc384a094dc5b2b1ba891ac93c891447845d8d917d1417252aecf273a913da504b8db"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider kubernetes1.25-controller-manager kubernetes1.25-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
