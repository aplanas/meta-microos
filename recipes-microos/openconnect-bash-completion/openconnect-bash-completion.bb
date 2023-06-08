SUMMARY = "Bash Completion for openconnect"
DESCRIPTION = "Bash completion script for openconnect."
LICENSE = "LGPL-2.1-or-later"

PV = "9.10"

RPM_NAME = "openconnect-bash-completion-9.10-1.1.noarch.rpm"
RPM_HASH = "c2f9d9d35a55449ece51b1fde16c343feb5a0a8cde6c4277e84df7b63b31d0aac0cb1e1c480f2a1e70fc2da65254b63ba32fe53c48b54231c9b75b194316be48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openconnect-bash-completion"
RDEPENDS:${PN} += "bash-completion openconnect"

inherit rpm
