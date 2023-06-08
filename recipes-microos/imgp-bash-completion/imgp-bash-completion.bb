SUMMARY = "Bash Completion for imgp"
DESCRIPTION = "Bash command line completion support for imgp."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "imgp-bash-completion-2.8-1.8.noarch.rpm"
RPM_HASH = "12a745aace95b813937514e17c2d0a442e30a9eb9dd04d760d3afcf6ea4f378b3ba111b60580570a1307071560a4b7b3fff038b86bd344b103e251e841ccf8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imgp-bash-completion"
RDEPENDS:${PN} += "bash-completion imgp"

inherit rpm
