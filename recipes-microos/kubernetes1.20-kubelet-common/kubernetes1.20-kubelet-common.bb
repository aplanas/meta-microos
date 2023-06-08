SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-kubelet-common-1.20.15-2.1.aarch64.rpm"
RPM_HASH = "b41d8017c7e1bac5fb544dbe27fce03cd796444892102a1d2387672595f9142a777d2cb9e48007bf0f15790e017995f35d183d894446b50496f7afa4a41d8b22"

RPROVIDES:${PN} += "kubernetes-kubelet-common kubernetes1.20-kubelet-common kubernetes1.20-kubelet-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cri-runtime kubernetes-kubelet1.20"

inherit rpm
