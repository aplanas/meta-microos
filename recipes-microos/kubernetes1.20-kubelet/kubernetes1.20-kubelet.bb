SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-kubelet-1.20.15-2.1.aarch64.rpm"
RPM_HASH = "fa227818db18a2521dd6bd0b35fb6d9d2785853e152e462030f96b2e95724b12561d040b33866ef744ece7efd4c9b7f5840b3e5d3a12d97cf5c6a484578b69fd"

RPROVIDES:${PN} += "kubernetes-kubelet1.20 kubernetes1.20-kubelet kubernetes1.20-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime kubernetes-kubelet-common libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm
