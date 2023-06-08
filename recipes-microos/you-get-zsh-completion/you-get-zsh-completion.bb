SUMMARY = "Zsh Completion for you-get"
DESCRIPTION = "ZSH command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-zsh-completion-0.4.1650-1.2.noarch.rpm"
RPM_HASH = "1531e4157d9b0cd9434bd26ffc8481f111bc8443821af82bfc34d7a9dc6e0c03280bc05fd414ef6e91c05a0bc3846169f23d1f62e146b5e7b735a5c8fd79d2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
