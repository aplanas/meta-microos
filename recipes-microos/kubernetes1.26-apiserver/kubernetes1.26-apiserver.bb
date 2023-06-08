SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-apiserver-1.26.4-1.1.aarch64.rpm"
RPM_HASH = "7b759a9ba1e02d21dd735c4f60a30accf5a1250886e3f986c3dc068dc17f67d4e3c228dd8f6785d4e5c7e3d4b2610c041910c9a06838b5a8326e86b10f5ca007"

RPROVIDES:${PN} += "kubernetes-apiserver-provider kubernetes1.26-apiserver kubernetes1.26-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
