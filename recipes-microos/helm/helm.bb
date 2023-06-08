SUMMARY = "The Kubernetes Package Manager"
DESCRIPTION = "Helm is a tool for managing Kubernetes charts. Charts are packages of pre-configured Kubernetes resources."
LICENSE = "Apache-2.0"

PV = "3.11.3"

RPM_NAME = "helm-3.11.3-2.1.aarch64.rpm"
RPM_HASH = "135adac13014c7780d3270fc41297306e37f34e5b70ae750b034c314a35f01096d110540485cdb4c894c843a58fd707e8d72d160d83600e4bbd2a48ba094d818"

RPROVIDES:${PN} += "helm helm(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
