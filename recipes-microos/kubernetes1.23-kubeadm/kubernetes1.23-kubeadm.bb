SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-kubeadm-1.23.17-3.1.aarch64.rpm"
RPM_HASH = "2fdfb372c81b1827e0a33a41962416e7570ba2395d2b618b3575e7ec303d710e37fc5aadf53cf2156bc83752c8b56ebbd603675b6fe81b73b5e5a5629c5bc7f4"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider kubernetes1.23-kubeadm kubernetes1.23-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) (kubernetes1.23-kubelet or kubernetes1.22-kubelet) cri-runtime cri-tools ebtables ethtool kubernetes-kubeadm-criconfig shadow socat"

inherit rpm
