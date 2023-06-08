SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-proxy-1.20.15-2.1.aarch64.rpm"
RPM_HASH = "6e3a8c1f4c047b1cee5c715c047feb8e55f61fd7930dd1ffd013ac490b64f39314b4bbcab6e39a47dafdf74dbcc21c7705833cae3e6fe48c5e07e6c128f4308e"

RPROVIDES:${PN} += "kubernetes-proxy-provider kubernetes1.20-proxy kubernetes1.20-proxy(aarch-64)"
RDEPENDS:${PN} += "conntrack-tools ebtables ipset iptables"

inherit rpm
