SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-kubeadm-1.22.17-2.1.aarch64.rpm"
RPM_HASH = "18d4cc5dec2881756dd9746cc062e843b673157f61d6e0d3742d85ebd7f169af1a99d4a9edb29b083332b6f460ee21a86703d003ecb57db3b7424a34e09d7449"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider kubernetes1.22-kubeadm kubernetes1.22-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) (kubernetes1.22-kubelet or kubernetes1.21-kubelet) cri-runtime cri-tools ebtables ethtool kubernetes-kubeadm-criconfig shadow socat"

inherit rpm
