SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-apiserver-1.26.4-1.2.aarch64.rpm"
RPM_HASH = "69a1f1c3de16158daeb8cb06ec7de5edf09417d30b35d0d942af948f6b1883017a0c2bcd3f2e9f418626d11c182cc291928bf13ef159c054dc004ef513e9ddc2"

RPROVIDES:${PN} += "kubernetes-apiserver-provider kubernetes1.26-apiserver kubernetes1.26-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
