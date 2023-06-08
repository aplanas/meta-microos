SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-controller-manager-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "50f930c25bff2f1e2efd2e290ca964605e1772bdf87fa241902f092577c9b5b8b03f815e62f40d97a11f5911c38c551528ff7981d22c3ac7b3390f46ab5d55a6"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider kubernetes1.27-controller-manager kubernetes1.27-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
