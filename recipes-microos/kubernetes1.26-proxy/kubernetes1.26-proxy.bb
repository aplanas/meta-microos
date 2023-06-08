SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-proxy-1.26.4-1.1.aarch64.rpm"
RPM_HASH = "7f99d428885cc077558e01efaf3973dc45fb1c25b9f7fc3ef417eeed5ab1b3013e4ee0a37913e1147d040c2a59b34c0ff8fbc54bfdcd0807f26eedd98e7d567c"

RPROVIDES:${PN} += "kubernetes-proxy-provider kubernetes1.26-proxy kubernetes1.26-proxy(aarch-64)"
RDEPENDS:${PN} += "conntrack-tools ebtables ipset iptables"

inherit rpm
