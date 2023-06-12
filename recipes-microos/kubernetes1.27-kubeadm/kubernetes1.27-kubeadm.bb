SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-kubeadm-1.27.1-1.2.aarch64.rpm"
RPM_HASH = "db77d3dae8449f0732cf866ff6f529bed6357f6ecb629207acea1a80c35648355407b101459dfbca5a09c35b4165961e4c407423e012ef0ff444e27441a8e9c6"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider kubernetes1.27-kubeadm kubernetes1.27-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) (kubernetes1.27-kubelet or kubernetes1.26-kubelet) cri-runtime cri-tools ebtables ethtool kubernetes-kubeadm-criconfig shadow socat"

inherit rpm
