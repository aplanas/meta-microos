SUMMARY = "Bash Completion for swww"
DESCRIPTION = "Bash command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.7.2"

RPM_NAME = "swww-bash-completion-0.7.2-1.3.noarch.rpm"
RPM_HASH = "05d1305d7766f897e27be606b540f3d527acbb5031a21acd468809cff4c12a1a87ac4782c490d6ee5b6ecbdc702250e8a45320eae74d17006b4fec41f6531146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
