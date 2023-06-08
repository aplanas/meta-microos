SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-kubelet-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "9d9eae2bfefc952d84212af96ede2bc2f4520c2aa51a1dcf7d1429cafc1383182de0e47bdbb3290aed63dd9442113037bbf5624a7908e7410d411c295f6113ad"

RPROVIDES:${PN} += "kubernetes-kubelet1.27 kubernetes1.27-kubelet kubernetes1.27-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime kubernetes-kubelet-common libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm
