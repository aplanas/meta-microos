SUMMARY = "Bash Completion for yq"
DESCRIPTION = "Bash command line completion support for yq."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-bash-completion-4.33.3-1.1.noarch.rpm"
RPM_HASH = "5d840d181b3ea7d5f1d237063d78174fb9576421bdf5ed8e9dbf8ebdafb7fa0ea650b25186a8cca2823e175322ec795e73a3aec34da54172cc0e04aefa7cb720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-bash-completion"
RDEPENDS:${PN} += "yq"

inherit rpm
