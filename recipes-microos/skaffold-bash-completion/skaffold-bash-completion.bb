SUMMARY = "Bash Completion for skaffold"
DESCRIPTION = "Bash command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "skaffold-bash-completion-2.5.0-1.1.noarch.rpm"
RPM_HASH = "8b7e9562450c27a710ace53ed097bac0e4c0bdc05fa2a2c145bfd1377ab0e9acfb01231d030fda4ba85ad1fef6c7af6f888c7633c0f1126858a2e158ce8d3955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-bash-completion"
RDEPENDS:${PN} += "bash-completion skaffold"

inherit rpm
