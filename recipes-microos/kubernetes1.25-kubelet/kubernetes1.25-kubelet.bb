SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-kubelet-1.25.9-1.2.aarch64.rpm"
RPM_HASH = "17f94720e4124f447042bc5fbd1f5425054366d7a006500edc4dedfc847c20ccc0b45213e4bd6803d676b8ff1b6180d808e29efca8c2d8ff442a85b115ff3f80"

RPROVIDES:${PN} += "kubernetes-kubelet1.25 kubernetes1.25-kubelet kubernetes1.25-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime kubernetes-kubelet-common libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm
