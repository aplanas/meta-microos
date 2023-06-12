SUMMARY = "Bash Completion for kubernetes1.20-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.20-client"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-client-bash-completion-1.20.15-2.2.noarch.rpm"
RPM_HASH = "af92a1491f4dfded8118d4d1b0db0a2542b634e77c7a9bc20c3364a591d93d74c2b373359e475531092a59f3c6bb272089c339834db40ee3b8991f4468c6e250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion kubernetes1.20-client-bash-completion"
RDEPENDS:${PN} += "bash-completion kubernetes1.20-client"

inherit rpm
