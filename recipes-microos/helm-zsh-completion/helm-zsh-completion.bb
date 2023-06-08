SUMMARY = "Zsh Completion for helm"
DESCRIPTION = "Zsh command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.11.3"

RPM_NAME = "helm-zsh-completion-3.11.3-2.1.noarch.rpm"
RPM_HASH = "02102e049ecde81488c1aef9aaf8bcb69eec5dd3c0e730c3e36817cd93bea79ecb91982724d5d76f886deff1909469af78317b1669ce2e297d8086e5b84aa061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-zsh-completion"
RDEPENDS:${PN} += "helm"

inherit rpm
