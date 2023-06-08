SUMMARY = "ZSH Completion for vcsh"
DESCRIPTION = "zsh command line completion support for vcsh."
LICENSE = "GPL-2.0-only"

PV = "1.20151229"

RPM_NAME = "vcsh-zsh-completion-1.20151229-3.11.noarch.rpm"
RPM_HASH = "ffac9465d5727c45e6fe4edecf0938a8d7ae7d39dca7e57072057028cda736ec7e0bd98a1317b881d21a5728268101ffb1770d5a1416501fae051ec977d3fa07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(vcsh-zsh-completion) vcsh-zsh-completion"
RDEPENDS:${PN} += "vcsh"

inherit rpm
