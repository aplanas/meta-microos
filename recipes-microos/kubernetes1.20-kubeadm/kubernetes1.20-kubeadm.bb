SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-kubeadm-1.20.15-2.1.aarch64.rpm"
RPM_HASH = "08fb78803baddf7b41e7845aa3308af07a9f8a1165666b17851aeebeed301470356312c338e50d5d98a403b2ef97de7b26a9bae358aaec813db62cbc74956396"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider kubernetes1.20-kubeadm kubernetes1.20-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) (kubernetes1.20-kubelet or kubernetes1.19-kubelet) cri-runtime ebtables ethtool kubernetes-kubeadm-criconfig shadow socat"

inherit rpm
