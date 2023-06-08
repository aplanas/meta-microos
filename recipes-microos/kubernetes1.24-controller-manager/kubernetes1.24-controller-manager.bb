SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-controller-manager-1.24.13-2.1.aarch64.rpm"
RPM_HASH = "7f180b4dda2acb1dca4db5b20925465d8f852f02c3b757d9a17673b1fa94c1ec269d03957cd2c047a0b7a833b343818c3120476326a8af3f23542d9eb20384b3"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider kubernetes1.24-controller-manager kubernetes1.24-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
