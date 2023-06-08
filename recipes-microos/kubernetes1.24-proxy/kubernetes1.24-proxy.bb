SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-proxy-1.24.13-2.1.aarch64.rpm"
RPM_HASH = "712d600301b38cb2784e35b4e9fe414a062ea7c9f881ab50e4e0a9fc2284429d180811cec50f70da31f176af815ef056753bdd6f26af023cafe034f9a22c06e7"

RPROVIDES:${PN} += "kubernetes-proxy-provider kubernetes1.24-proxy kubernetes1.24-proxy(aarch-64)"
RDEPENDS:${PN} += "conntrack-tools ebtables ipset iptables"

inherit rpm
