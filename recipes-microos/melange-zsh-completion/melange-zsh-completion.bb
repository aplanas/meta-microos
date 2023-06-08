SUMMARY = "Zsh Completion for melange"
DESCRIPTION = "zsh command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-zsh-completion-0.3.2-1.1.noarch.rpm"
RPM_HASH = "895c4691f792af5ea1eeada4f8b0772be06a5559a04281ef3a5b175e6237addd3a09f3ed0f88c8dd39a6b19b153a0c17016ba0e7c543af8a50ecea13373d472f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-zsh-completion"
RDEPENDS:${PN} += "melange"

inherit rpm
