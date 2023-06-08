SUMMARY = "Bash Completion for lxd"
DESCRIPTION = "Bash command line completion support for lxd."
LICENSE = "Apache-2.0"

PV = "5.11"

RPM_NAME = "lxd-bash-completion-5.11-1.3.noarch.rpm"
RPM_HASH = "d9fd085cd4adb4bd7f7972c24b5d29214c8d669d5bc3e773ec53b507fd433cac4254743bf4d14c78f27e66fd2e73a5ac70fcec37c3d99e3a911525efabfbc716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxd-bash-completion"
RDEPENDS:${PN} += "lxd"

inherit rpm
