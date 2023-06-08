SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-proxy-1.22.17-2.1.aarch64.rpm"
RPM_HASH = "c7f7e73b1285768a4a61e12a7035d648e59ca4e7d867fa338d5e89c0b33ce186391bdf778497a460c03269b8842751f9342de42caa9059b4e03e93da4abcc4d3"

RPROVIDES:${PN} += "kubernetes-proxy-provider kubernetes1.22-proxy kubernetes1.22-proxy(aarch-64)"
RDEPENDS:${PN} += "conntrack-tools ebtables ipset iptables"

inherit rpm
