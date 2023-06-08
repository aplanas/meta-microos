SUMMARY = "Bash completion routines for the kmod utilities"
DESCRIPTION = "Contains bash completion support for kmod utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "kmod-bash-completion-30-3.1.noarch.rpm"
RPM_HASH = "ea61ceff54a220d8b9905331e0ff5ad5c202f5dbdd417d3639d95f3f999cf7caec4f15570c68293dcab8e3a73d2fa66006f73a21205e9a463155f97cf1a92cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmod-bash-completion"
RDEPENDS:${PN} += "bash-completion kmod"

inherit rpm
