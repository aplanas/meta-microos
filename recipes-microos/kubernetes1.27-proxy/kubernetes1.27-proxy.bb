SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-proxy-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "0c9cce54ad3e50d7eb11197b245371cdc313f7ec2babe882ae286636e2eee49949fac4fb5c4ae84ac629979b9e1ea280abe02f2000f006156bc71f9a9a5780c5"

RPROVIDES:${PN} += "kubernetes-proxy-provider kubernetes1.27-proxy kubernetes1.27-proxy(aarch-64)"
RDEPENDS:${PN} += "conntrack-tools ebtables ipset iptables"

inherit rpm
