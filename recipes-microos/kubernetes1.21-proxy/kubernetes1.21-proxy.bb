SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-proxy-1.21.14-2.1.aarch64.rpm"
RPM_HASH = "6834f24920e0b7e72a0cf82d1e213cd0158273cb9d72ab93325e5416e571e0905cdeeafe7893752e727d0271a489eb6702faf5bd68cb85a24b34f04f8c10e350"

RPROVIDES:${PN} += "kubernetes-proxy-provider kubernetes1.21-proxy kubernetes1.21-proxy(aarch-64)"
RDEPENDS:${PN} += "conntrack-tools ebtables ipset iptables"

inherit rpm
