SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-apiserver-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "80f28df50e6e98ded12326711d7e6e162b8c5ed47794c2d5e00e8c59141d25e245f49be8762b5c6c1ffa8d15ba63443129a9d333c5a530ed0db3a8267744d882"

RPROVIDES:${PN} += "kubernetes-apiserver-provider kubernetes1.27-apiserver kubernetes1.27-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
