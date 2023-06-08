SUMMARY = "Zsh completion for highlight"
DESCRIPTION = "This package provides Zsh command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.5"

RPM_NAME = "highlight-zsh-completion-4.5-1.3.noarch.rpm"
RPM_HASH = "4d64b97606be0caea92b82974bc60407bbe7761f3d1d8d0586ef3919921d16b4dc8890d0e47a4cfa52dd68d70ef88d99b7bf563557710c15870a7547edfa9760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-zsh-completion"
RDEPENDS:${PN} += "highlight zsh"

inherit rpm
