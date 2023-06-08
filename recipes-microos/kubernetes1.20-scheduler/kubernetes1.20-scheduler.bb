SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-scheduler-1.20.15-2.1.aarch64.rpm"
RPM_HASH = "ddd5d9464900b421a4e3dabeaf57eb97e5133b09c52188767ac9fea1b9caf8752a22d2934f22248466aba44311117948475e255c9918f3fed2df5c47c5c7f8f6"

RPROVIDES:${PN} += "kubernetes-scheduler-provider kubernetes1.20-scheduler kubernetes1.20-scheduler(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
