SUMMARY = "Fish Completion for yadm"
DESCRIPTION = "The official fish completion script for yadm."
LICENSE = "GPL-3.0-only"

PV = "3.2.1"

RPM_NAME = "yadm-fish-completion-3.2.1-1.5.noarch.rpm"
RPM_HASH = "3fa8f5b5dfaf74ea210bcb576958fa6a9ba0f0db9f37df49463f9ab18b40a62d6d43db413a6fee189fcf48b44f63e239e47d1e32e0a6eb3f0462084477d710d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm-fish-completion"
RDEPENDS:${PN} += ""

inherit rpm
