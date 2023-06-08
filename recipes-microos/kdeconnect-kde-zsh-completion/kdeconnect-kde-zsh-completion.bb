SUMMARY = "ZSH completion for kdeconnect-kde"
DESCRIPTION = "ZSH command line completion support for kdeconnect-kde."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdeconnect-kde-zsh-completion-23.04.0-1.1.noarch.rpm"
RPM_HASH = "e0d72b1250f2bfa101188ac90e368ed0049046cae6cc6b803d15fc96cc0c420de039bf3e7dbc46fee383b502fc9c11b2ee0b016d228e3fb88b57919f00b3ce44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeconnect-kde-zsh-completion"
RDEPENDS:${PN} += "kdeconnect-kde"

inherit rpm
