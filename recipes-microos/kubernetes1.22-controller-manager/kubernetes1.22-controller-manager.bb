SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-controller-manager-1.22.17-2.1.aarch64.rpm"
RPM_HASH = "b3fa04ed09f95b607da98274ebddbf06abb7bb7cbb487cf0047aa7bcf8d4ba7883f1e8c1905fff0150f746a82d83e8695f6928d1343ff81e9ae548623a347b74"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider kubernetes1.22-controller-manager kubernetes1.22-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
