SUMMARY = "ZSH Completion for hut"
DESCRIPTION = "The official zsh completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-zsh-completion-0.3.0-1.2.noarch.rpm"
RPM_HASH = "9f3c60bf12571d4ef7e7f80782d528bc2997f1bc8a8191de36c5c1715cc05bfcb89ba7a857a8c6b2b1de8c372d15d7befc02b9d8b88af2d983b1cba500272abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
