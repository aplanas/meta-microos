SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-controller-manager-1.21.14-2.1.aarch64.rpm"
RPM_HASH = "5f6d712de8b74f80318f47102f11dcf05facefa11f6d1faae13c64f02acc46eda0d9597af63f36d882f38de50f8de5d180b7a23e830bb4c919ce4dd00ca1f03d"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider kubernetes1.21-controller-manager kubernetes1.21-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
