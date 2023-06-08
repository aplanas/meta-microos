SUMMARY = "Bash completion for gnuastro"
DESCRIPTION = "Bash command line completion support for gnuastro"
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-bash-completion-0.19-1.10.noarch.rpm"
RPM_HASH = "b08a89b9a72aec7140fbad1e0826869304fdb60aeb6d987bf75ca64787301d2ac30db2181f18f0ae23337eaf3ba294865fb43ff059a142c7d3f4770fa209e0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuastro-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
