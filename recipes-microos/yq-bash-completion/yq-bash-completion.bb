SUMMARY = "Bash Completion for yq"
DESCRIPTION = "Bash command line completion support for yq."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-bash-completion-4.33.3-1.2.noarch.rpm"
RPM_HASH = "7a70d2c6e8fb38cc78d82a272ee4dcf9dbf929ff9d3082c47885ea9af98e56c5dd23c649d699091fe62bc6beffeb93c9cdba71d8d03623e4602020ec5ad5ba18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-bash-completion"
RDEPENDS:${PN} += "yq"

inherit rpm
