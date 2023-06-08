SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-kubelet-common-1.26.4-1.1.aarch64.rpm"
RPM_HASH = "41dcc19586ce9125cf73d580703d876d26dfd5a25437aa2ec96c865511b7bd3f1d0581fe9c256d9caf94ce754a38cb996f5762987d0ab5359f78d2f9afd029ba"

RPROVIDES:${PN} += "kubernetes-kubelet-common kubernetes1.26-kubelet-common kubernetes1.26-kubelet-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cri-runtime kubernetes-kubelet1.26"

inherit rpm
