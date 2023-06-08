SUMMARY = "Rancher kim - The Kubernetes Image Manager"
DESCRIPTION = "kim is a Kubernetes-aware CLI that will install a small builder backend consisting of a BuildKit daemon bound to the Kubelet's underlying containerd socket (for building images) along with a small server-side agent that the CLI leverages for image management (think push, pull, etc) rather than talking to the backing containerd/CRI directly. kim enables building images locally, natively on your k3s cluster."
LICENSE = "Apache-2.0"

PV = "0.1.0~beta.7"

RPM_NAME = "rancher-kim-0.1.0~beta.7-1.8.aarch64.rpm"
RPM_HASH = "e23e5ac8a606bacee34221d97f8441b6bcbdf371dae24102a30a6747637cd1da255a8ea16908f330665ccf27bb13e7cbbdc81210dac7a81fb356ef29440c88c9"

RPROVIDES:${PN} += "rancher-kim rancher-kim(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
