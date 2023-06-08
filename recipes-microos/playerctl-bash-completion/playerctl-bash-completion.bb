SUMMARY = "Bash completion for playerctl"
DESCRIPTION = "Bash command line completion support for playerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-bash-completion-2.4.1-1.8.noarch.rpm"
RPM_HASH = "fc3f77a611d860d422bca985f6e9867727e6fe77bf9014173140d1fc73ebdf643e4e3c0ad7d61940738583e72894d62c420139a1f541589acb76e51725986ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "playerctl-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
