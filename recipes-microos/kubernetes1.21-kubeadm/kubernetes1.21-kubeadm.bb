SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-kubeadm-1.21.14-2.1.aarch64.rpm"
RPM_HASH = "eee391fc4adabd4cde7a08dcf538897357374fc539776ad24145c8eb5009f4db385369f318d51c9d78db12f922354b4609a2f0e39e02923765e9040f18f1e326"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider kubernetes1.21-kubeadm kubernetes1.21-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) (kubernetes1.21-kubelet or kubernetes1.20-kubelet) cri-runtime ebtables ethtool kubernetes-kubeadm-criconfig shadow socat"

inherit rpm
