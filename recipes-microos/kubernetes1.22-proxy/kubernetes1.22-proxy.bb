SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-proxy-1.22.17-2.2.aarch64.rpm"
RPM_HASH = "25ef804da314ea123ee9fe33f29eb24087707bf3780f0a673cd619aea46ae0b922fbc587f168112a580aa8ce4bba1d803eaddf8f8983b5558af6c76155de44c1"

RPROVIDES:${PN} += "kubernetes-proxy-provider kubernetes1.22-proxy kubernetes1.22-proxy(aarch-64)"
RDEPENDS:${PN} += "conntrack-tools ebtables ipset iptables"

inherit rpm
