SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-kubelet-1.22.17-2.1.aarch64.rpm"
RPM_HASH = "5cfb635b7b4fb2d920bd2df1f06bbfa62bdde6ee51450c1e486031f39fe24d95575ffd91df49a163e9abc30da7954c8bee8dc0b81ea4e5bf3c581ea622ef3a3b"

RPROVIDES:${PN} += "kubernetes-kubelet1.22 kubernetes1.22-kubelet kubernetes1.22-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime kubernetes-kubelet-common libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm
