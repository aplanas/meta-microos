SUMMARY = "ZSH completion for konsole"
DESCRIPTION = "ZSH command line completion support for konsole."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "konsole-zsh-completion-23.04.0-1.1.noarch.rpm"
RPM_HASH = "542b26f2d198745352bf583ea5895c9bfff4fcb7692944db9d7851b7b4169cce210abc5ba33962f4d50dd4e93bbca9ddebaaae365f5fd1fc4cb376e368a54cfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konsole-zsh-completion"
RDEPENDS:${PN} += "konsole"

inherit rpm
