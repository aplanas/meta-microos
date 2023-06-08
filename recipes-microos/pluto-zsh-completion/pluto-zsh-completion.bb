SUMMARY = "Zsh Completion for pluto"
DESCRIPTION = "Zsh command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.16.1"

RPM_NAME = "pluto-zsh-completion-5.16.1-1.1.noarch.rpm"
RPM_HASH = "7d757733f8ab030d8330cb5e4afcd0aaacc5139e019d4608c919875e2b739e49279ba091b01c4a6b23998fcdc621153e8efb7b64bb6761ee8175fb1dc89e3986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-zsh-completion"
RDEPENDS:${PN} += "pluto"

inherit rpm
