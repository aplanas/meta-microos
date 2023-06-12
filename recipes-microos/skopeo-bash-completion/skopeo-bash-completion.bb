SUMMARY = "Bash completion for skopeo"
DESCRIPTION = "This package contains the bash completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "skopeo-bash-completion-1.12.0-1.1.noarch.rpm"
RPM_HASH = "1a93c16649f6bf1f897a12e03e4907445613ff5ac60875f54df9f3f74c39614bdd60732c0045e989a2f2fee4628a915c6b091f9ec6e83511524dc01197e95a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-bash-completion"
RDEPENDS:${PN} += "bash-completion skopeo"

inherit rpm
