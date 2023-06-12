SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-client-1.20.15-2.2.aarch64.rpm"
RPM_HASH = "66c6d4a3fbdb433f65323e6651f97a5a8aeb02940c132ffe3190a0f4b6dd720067c08774fed25df6c7d4fe63db131ab51de3e68419121929161f9262a9f94fe7"

RPROVIDES:${PN} += "kubernetes-client-provider kubernetes1.20-client kubernetes1.20-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes-client-common update-alternatives"

inherit rpm
