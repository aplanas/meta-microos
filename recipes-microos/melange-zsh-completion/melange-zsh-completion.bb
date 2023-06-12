SUMMARY = "Zsh Completion for melange"
DESCRIPTION = "zsh command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-zsh-completion-0.3.2-1.2.noarch.rpm"
RPM_HASH = "0219c47f65d65d0f4cca48a41440b1ceccaada899ef164c03f37b52b16df9ae7843dddbb360c664055d6a27af9eb6e186551115ffdbe53a6c3a283f5cfaa6dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-zsh-completion"
RDEPENDS:${PN} += "melange"

inherit rpm
