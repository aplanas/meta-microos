SUMMARY = "Zsh Completion for kubeaudit"
DESCRIPTION = "zsh command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-zsh-completion-0.22.0-1.1.noarch.rpm"
RPM_HASH = "c4cbfba14785a07550ca1faeb5af97420cbf5a30b4b2de592f6aeab32a2aa8c2c0c2be87bc45dd9f537cc2e3d17ad92faba533d0152c33d0ad21343f8763ead1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-zsh-completion"
RDEPENDS:${PN} += "kubeaudit"

inherit rpm
