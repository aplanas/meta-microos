SUMMARY = "The Kubernetes Package Manager"
DESCRIPTION = "Helm is a tool for managing Kubernetes charts. Charts are packages of pre-configured Kubernetes resources."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "helm-3.12.0-1.1.aarch64.rpm"
RPM_HASH = "d6439de44c3fc0d668608ce5e3ab9335f39404a92dff5a083dceea1b9ae79dacdcf211db64f15391462501cfc9615aa04f2aed24bbc6273ca64dd2a0349548b7"

RPROVIDES:${PN} += "helm helm(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
