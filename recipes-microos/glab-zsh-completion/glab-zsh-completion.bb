SUMMARY = "Zsh completion for glab"
DESCRIPTION = "Zsh command line completion support for glab."
LICENSE = "MIT"

PV = "1.29.1"

RPM_NAME = "glab-zsh-completion-1.29.1-1.1.noarch.rpm"
RPM_HASH = "f6b8e5e78430f40b80be6861bee75f67c8a5e1470d976edf92510345590dcf943f869a922bd2d7efcd624b7407955419f7debcd0c6552529db4e894639b60850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-zsh-completion"
RDEPENDS:${PN} += "glab"

inherit rpm
