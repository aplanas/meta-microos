SUMMARY = "Rancher kim - The Kubernetes Image Manager"
DESCRIPTION = "kim is a Kubernetes-aware CLI that will install a small builder backend consisting of a BuildKit daemon bound to the Kubelet's underlying containerd socket (for building images) along with a small server-side agent that the CLI leverages for image management (think push, pull, etc) rather than talking to the backing containerd/CRI directly. kim enables building images locally, natively on your k3s cluster."
LICENSE = "Apache-2.0"

PV = "0.1.0~beta.7"

RPM_NAME = "rancher-kim-0.1.0~beta.7-1.9.aarch64.rpm"
RPM_HASH = "7c1c4ff555442b9851694a77af1c64f398970db2e3dbe124721e78e2251ce6790d3c130c8e317c6fc5f4cf20c537f605b67d2be6be6e3c190626f8b266a3d003"

RPROVIDES:${PN} += "rancher-kim rancher-kim(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
