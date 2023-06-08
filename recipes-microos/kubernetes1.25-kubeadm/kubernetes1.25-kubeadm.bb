SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-kubeadm-1.25.9-1.1.aarch64.rpm"
RPM_HASH = "184ceccccb152a0c9eeb4ca3533b9166e443f4901560135169b3ecf662157618e3de16a75c5372d2fa2622d44659095526eb7b3a6d5831e07a15d135abb70e3c"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider kubernetes1.25-kubeadm kubernetes1.25-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) (kubernetes1.25-kubelet or kubernetes1.24-kubelet) cri-runtime cri-tools ebtables ethtool kubernetes-kubeadm-criconfig shadow socat"

inherit rpm
