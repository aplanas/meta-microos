SUMMARY = "Bash Completion for openconnect"
DESCRIPTION = "Bash completion script for openconnect."
LICENSE = "LGPL-2.1-or-later"

PV = "9.12"

RPM_NAME = "openconnect-bash-completion-9.12-1.1.noarch.rpm"
RPM_HASH = "c63f14167a8844fad1e8519336e78b62f3e13ed6c98a98303964bc1a6f685937915d65d7e2ad3dec40e3c074576166d90da5a5461fa49b85eb79cb5a1b149da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openconnect-bash-completion"
RDEPENDS:${PN} += "bash-completion openconnect"

inherit rpm
