SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-kubeadm-1.22.17-2.2.aarch64.rpm"
RPM_HASH = "45e5bda96c40fc0baf3b2b3cc016cd35947b682b2874e4f07cd16b109497a9642eb957eafff21851a9c02f42d387aab5a53629cc2c8912c530e209ab5943855f"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.22-kubeadm \
kubernetes1.22-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) \
(kubernetes1.22-kubelet or kubernetes1.21-kubelet) \
cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
