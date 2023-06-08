SUMMARY = "ZSH Completion for yadm"
DESCRIPTION = "The official zsh completion script for yadm."
LICENSE = "GPL-3.0-only"

PV = "3.2.1"

RPM_NAME = "yadm-zsh-completion-3.2.1-1.5.noarch.rpm"
RPM_HASH = "f4f29540eaea53a13e5bbdf7312e9663d9d567c2a67f79f31bedce2bee04766a3f12e393958e4afc5b2ae51ab3b5157e914499d4485f42828f1dddc48fa5afc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
