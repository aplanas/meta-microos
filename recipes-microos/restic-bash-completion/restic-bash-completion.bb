SUMMARY = "Bash Completion for restic"
DESCRIPTION = "Bash command line completion support for restic."
LICENSE = "BSD-2-Clause"

PV = "0.15.2"

RPM_NAME = "restic-bash-completion-0.15.2-1.2.noarch.rpm"
RPM_HASH = "15551d4a4e39e71c7048b7a31bdb7d23ece06c7a8ac163549913bdb4d1104566a3d963978ff2486a24b9b9f926aeef9419734b7121c82ed67695aa82fa626048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "restic-bash-completion"
RDEPENDS:${PN} += "restic"

inherit rpm
