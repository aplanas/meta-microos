SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-apiserver-1.24.13-2.1.aarch64.rpm"
RPM_HASH = "4f390a06e56f94ae1bd3dc54c969690f3105e4ecf2718aa081e95ce4f0fdb5200f080a12c8b06c9400769cbc85a0817969dcc4e337d165742cd598fa97d6dfeb"

RPROVIDES:${PN} += "kubernetes-apiserver-provider kubernetes1.24-apiserver kubernetes1.24-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
