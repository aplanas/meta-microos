SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-kubelet-1.24.13-2.1.aarch64.rpm"
RPM_HASH = "832605af5150c12bb18ec5aca79797a43671b7436d2158013b05f55afe124cf8f68ff32e28409851f814deb3bc09c4f77f230c8739a6cc6f085552a780a35477"

RPROVIDES:${PN} += "kubernetes-kubelet1.24 kubernetes1.24-kubelet kubernetes1.24-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime kubernetes-kubelet-common libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm
