SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-kubelet-1.26.4-1.1.aarch64.rpm"
RPM_HASH = "94199a5d9365c9b3a8623046b9c960d3a9361a1ed9e0bdca776d3da405a9560895345b09e44a5c7780f36ec16977e1705f370af2af470d08c634f223867feead"

RPROVIDES:${PN} += "kubernetes-kubelet1.26 kubernetes1.26-kubelet kubernetes1.26-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime kubernetes-kubelet-common libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm
