SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-kubeadm-1.26.4-1.1.aarch64.rpm"
RPM_HASH = "e36b81c67ee986d2e53881c28372cf9f956ddf58011a5b5acf8bb07b947ef822a437fdfcf4dee85b28d8ace9b3684725d5908e79b7894aabc100ef6bae2ae266"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider kubernetes1.26-kubeadm kubernetes1.26-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) (kubernetes1.26-kubelet or kubernetes1.25-kubelet) cri-runtime cri-tools ebtables ethtool kubernetes-kubeadm-criconfig shadow socat"

inherit rpm
