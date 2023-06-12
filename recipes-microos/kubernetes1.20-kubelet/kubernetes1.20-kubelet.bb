SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-kubelet-1.20.15-2.2.aarch64.rpm"
RPM_HASH = "dcf3f0efcf25873e3d1096f49414f32521317a6dfb1b434e76275bed9f7bd244891c769081f843d2606370f0818ad141c27eca50c495af7cbc0379ee195d6b6a"

RPROVIDES:${PN} += "kubernetes-kubelet1.20 \
kubernetes1.20-kubelet \
kubernetes1.20-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6(GLIBC_2.34)(64bit) \
systemd"

inherit rpm
