SUMMARY = "Bash Completion for istioctl"
DESCRIPTION = "Bash command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.17.2"

RPM_NAME = "istioctl-bash-completion-1.17.2-2.2.noarch.rpm"
RPM_HASH = "ec7a51009824afefd1567d4ed9a62f3de584b1d1f518826686b37fdd436aed89665b28c5a3b78e78ba07798c987e42541d1ba432f8fee519f6bc7eceb6193f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-bash-completion"
RDEPENDS:${PN} += "bash-completion istioctl"

inherit rpm
