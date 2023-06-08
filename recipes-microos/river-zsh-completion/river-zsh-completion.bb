SUMMARY = "Zsh Completion for river"
DESCRIPTION = "Zsh command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g109"

RPM_NAME = "river-zsh-completion-0.2.4+g109-3.1.noarch.rpm"
RPM_HASH = "9b21896717c97d6dc0ddae20fe2c01039760e5e06dc85de3b1283e17d6a4760bfce88eb65f48f15ff5dbed7b96fa349711f3b241301db1f521c05476d29f46be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
