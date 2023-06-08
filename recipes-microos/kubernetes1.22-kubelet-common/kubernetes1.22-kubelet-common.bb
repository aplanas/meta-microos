SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-kubelet-common-1.22.17-2.1.aarch64.rpm"
RPM_HASH = "08715b2788f5ac9545f9fbe45bdb3bfa431238ce6df5786c8a6cddc63cce12f1615e56d5425960ce1a34b5826901a6533744d375724d01b090fc252db4dcc696"

RPROVIDES:${PN} += "kubernetes-kubelet-common kubernetes1.22-kubelet-common kubernetes1.22-kubelet-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cri-runtime kubernetes-kubelet1.22"

inherit rpm
