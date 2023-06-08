SUMMARY = "Fish Completion for kubeaudit"
DESCRIPTION = "Fish command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-fish-completion-0.22.0-1.1.noarch.rpm"
RPM_HASH = "1f15d494d6eb5a312ced5e55204e0ae5aa18b184cba5c879c751fa6c3f94a6170b3c7265783fae31936f3b2ef9994123cac15fc031259af043ca37943a648200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-fish-completion"
RDEPENDS:${PN} += "kubeaudit"

inherit rpm
