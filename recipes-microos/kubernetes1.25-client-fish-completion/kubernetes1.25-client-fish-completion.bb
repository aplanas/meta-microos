SUMMARY = "Fish Completion for kubernetes1.25-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.25-client."
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-client-fish-completion-1.25.9-1.1.noarch.rpm"
RPM_HASH = "6dc08002dd67026c6e3b413eacfa8d990ac3d450d727cd7284c489d67799fcd5ce42815237052423c27fc0fba10f78cf763df0f5884ac982082e5120ff40ac4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion kubernetes1.25-client-fish-completion"
RDEPENDS:${PN} += "kubernetes1.25-client"

inherit rpm
