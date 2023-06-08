SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes-proxy-1.27.1-30.1.aarch64.rpm"
RPM_HASH = "c3de8f9cec7747588e75a9ba2b31cf066f6b5a72d33529924a44e7615a0b9f3d871cd57d62e8f9cf5115591b2d1263b49567cde48fa9a17cfb9c5b00208ce227"

RPROVIDES:${PN} += "kubernetes-proxy kubernetes-proxy(aarch-64)"
RDEPENDS:${PN} += "kubernetes1.27-proxy"

inherit rpm
