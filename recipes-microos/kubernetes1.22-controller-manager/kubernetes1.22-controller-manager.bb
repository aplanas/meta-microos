SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-controller-manager-1.22.17-2.2.aarch64.rpm"
RPM_HASH = "0edc302ec31f83d2b97f7f2a3f913bf10f4f4292cff2426b42de2de1d949b8286d61ac2fa36482e27832f50380509a9e54200d4e84909d968627d957232b8b1b"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider kubernetes1.22-controller-manager kubernetes1.22-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
