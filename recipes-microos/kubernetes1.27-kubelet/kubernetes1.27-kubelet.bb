SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-kubelet-1.27.1-1.2.aarch64.rpm"
RPM_HASH = "1487706a6b893891000e3cc3ae10dbcdd0743a8a8f0aedd8d7da063c87ab3347ad61071a7dda74d31dc322a38a7702c09432caf0b1789e9f48167b32b90eab26"

RPROVIDES:${PN} += "kubernetes-kubelet1.27 \
kubernetes1.27-kubelet \
kubernetes1.27-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6(GLIBC_2.34)(64bit) \
systemd"

inherit rpm
