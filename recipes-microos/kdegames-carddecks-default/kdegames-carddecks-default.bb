SUMMARY = "Default Card Decks for KDE Games"
DESCRIPTION = "This package contains the default card deck set for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kdegames-carddecks-default-23.04.1-1.1.noarch.rpm"
RPM_HASH = "86ff7ce918e7937ceae4af5b8b9ab4082a0dd75ed8a15152728c46446c23bf452e1fa0726bc2ede333c394fe95b30547fecca921f98e959596d6e8c909af4a64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdegames-carddecks-default"
RDEPENDS:${PN} += ""

inherit rpm
