SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-kubelet-common-1.25.9-1.1.aarch64.rpm"
RPM_HASH = "e2591fc487f92e0caab1a363bd98143f3d96a28a4c2090217b97f6128af344481c8b506776e3040983f9eb03c605d2d1a55df6649c0abf8c007185bb32b6f5d6"

RPROVIDES:${PN} += "kubernetes-kubelet-common kubernetes1.25-kubelet-common kubernetes1.25-kubelet-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cri-runtime kubernetes-kubelet1.25"

inherit rpm
