SUMMARY = "Bash Completion for hugo"
DESCRIPTION = "The official bash completion script for hugo, generated during the build."
LICENSE = "Apache-2.0"

PV = "0.111.3"

RPM_NAME = "hugo-bash-completion-0.111.3-1.1.noarch.rpm"
RPM_HASH = "e73c46c863cdeb5f37f23346595d347d37ec947c527a83abf2daed3059a426b892b03a0ef9a3cc27048482a138806afdf5914e8103f04bf9f7f1a2db2638bbb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hugo-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
