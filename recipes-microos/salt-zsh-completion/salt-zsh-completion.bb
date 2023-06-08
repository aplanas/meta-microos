SUMMARY = "Zsh Completion for salt"
DESCRIPTION = "Zsh command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-zsh-completion-3006.0-1.1.noarch.rpm"
RPM_HASH = "b0a0468d97f3de364d417679ffee2361181e788bbc413bc49a5d62f9836636c907e464c610f162622304f7f1eeb7e63c6d95f0622227ffe6fe427a1d22286d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(salt-zsh-completion) salt-zsh-completion"
RDEPENDS:${PN} += "salt zsh"

inherit rpm
