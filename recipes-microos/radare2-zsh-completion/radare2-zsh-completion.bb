SUMMARY = "ZSH completion for radare2"
DESCRIPTION = "zsh shell completions for radare2."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "5.7.8"

RPM_NAME = "radare2-zsh-completion-5.7.8-1.4.noarch.rpm"
RPM_HASH = "d62bf25ea30227261f2b4f2569fb5bb1740a5f6f48908f5d014485dff55b6672ea1d292a1382a13178ffa07bfac95d4c5a881276e8967cc0e8bb44f3d5151bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "radare2-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
