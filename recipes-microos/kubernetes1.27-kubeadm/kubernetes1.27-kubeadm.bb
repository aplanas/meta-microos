SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-kubeadm-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "c0e22b8508fd453904b0863edf7e642891beaea04dded8e93ac2335c842f1a7063f7ee7d8128ef6a7a33bc6bc0462d34f57eabfc084717cf6debd827c3c8471e"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider kubernetes1.27-kubeadm kubernetes1.27-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) (kubernetes1.27-kubelet or kubernetes1.26-kubelet) cri-runtime cri-tools ebtables ethtool kubernetes-kubeadm-criconfig shadow socat"

inherit rpm
