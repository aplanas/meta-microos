SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-kubelet-1.22.17-2.2.aarch64.rpm"
RPM_HASH = "1331fd81cdb0d5239f93e937dd33012b562a1ace1fc14d7fb3064290d84cdde834aed500ef9e044d15fc9541eef05f945a043c2daca0e4d6b1b4bf774b6303c1"

RPROVIDES:${PN} += "kubernetes-kubelet1.22 \
kubernetes1.22-kubelet \
kubernetes1.22-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6(GLIBC_2.34)(64bit) \
systemd"

inherit rpm
