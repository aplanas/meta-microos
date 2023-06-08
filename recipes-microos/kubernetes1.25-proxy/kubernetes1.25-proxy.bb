SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-proxy-1.25.9-1.1.aarch64.rpm"
RPM_HASH = "145d795828fa95fec70962af81222b1391feb497af44cae8aff486abc177e58d63b44e347146f3a46133d8b6ef5354771bd7251b77ac8599227688995087dec8"

RPROVIDES:${PN} += "kubernetes-proxy-provider kubernetes1.25-proxy kubernetes1.25-proxy(aarch-64)"
RDEPENDS:${PN} += "conntrack-tools ebtables ipset iptables"

inherit rpm
