SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-kubelet-1.21.14-2.1.aarch64.rpm"
RPM_HASH = "b3c8728d1fa833c5ab1ae4933d19b0734aa62bf23d134f3e227a2005e83ac082b74b3647291a9e5e4c2ddb53587b62a8bb5acc3eac54201112a0d62830d63503"

RPROVIDES:${PN} += "kubernetes-kubelet1.21 kubernetes1.21-kubelet kubernetes1.21-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime kubernetes-kubelet-common libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm
