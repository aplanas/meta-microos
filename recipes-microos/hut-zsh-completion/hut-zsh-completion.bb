SUMMARY = "ZSH Completion for hut"
DESCRIPTION = "The official zsh completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-zsh-completion-0.3.0-1.1.noarch.rpm"
RPM_HASH = "930dc13f3e19273aca223fe6151471ecf065d8a4c030d6f988208179bac2c6118de05b373953cf7dc0d825949afae7555dd7b43bc71fe1a14f6143a115e2c76e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
