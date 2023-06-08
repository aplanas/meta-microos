SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-kubeadm-1.24.13-2.1.aarch64.rpm"
RPM_HASH = "81769157ec4531d52a02c6215cf27d1a99b95dd0faf1e8fe2feb4e4d4c1d716f63d50e5ee62e199b4f0d30f895890baf3bec35da78985c4fd2bbdb84547131e6"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider kubernetes1.24-kubeadm kubernetes1.24-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) (kubernetes1.24-kubelet or kubernetes1.23-kubelet) cri-runtime cri-tools ebtables ethtool kubernetes-kubeadm-criconfig shadow socat"

inherit rpm
