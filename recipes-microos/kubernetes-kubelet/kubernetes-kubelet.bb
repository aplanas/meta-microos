SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes-kubelet-1.27.1-30.1.aarch64.rpm"
RPM_HASH = "1d0977e64fd7a8ead2fe69aeead569df0800833585122bf90aa21bef60cc1381d6941f781f13d557c02481a100ab84c9c50cedcbf3b8ef21fe9963de4bbc9a61"

RPROVIDES:${PN} += "kubernetes-kubelet kubernetes-kubelet(aarch-64)"
RDEPENDS:${PN} += "kubernetes1.27-kubelet"

inherit rpm
