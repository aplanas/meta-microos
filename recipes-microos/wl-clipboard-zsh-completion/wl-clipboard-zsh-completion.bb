SUMMARY = "Zsh completion for wl-clipboard"
DESCRIPTION = "Zsh command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "wl-clipboard-zsh-completion-2.1.0-1.6.noarch.rpm"
RPM_HASH = "aead849fbaa35626f41d17036a2e8057a65a1baf4ad1a326684ffd20177841bb399ffc9a0c698eb1988aaa5cf13ca52bd48357ea74826296be4f45f25b57e85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-zsh-completion"
RDEPENDS:${PN} += "wl-clipboard"

inherit rpm
