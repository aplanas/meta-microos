SUMMARY = "Bash Completion for melange"
DESCRIPTION = "Bash command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-bash-completion-0.3.2-1.1.noarch.rpm"
RPM_HASH = "023f259385bb1c041d9f2a0793b90155ed1ce7d4a5ab8d2e403937383ff865740916ea3535c98a742fae57f2760d637a6f9d807ecec2954509db4693cc401972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-bash-completion"
RDEPENDS:${PN} += "melange"

inherit rpm
