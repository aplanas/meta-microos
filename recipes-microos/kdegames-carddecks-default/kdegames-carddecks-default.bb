SUMMARY = "Default Card Decks for KDE Games"
DESCRIPTION = "This package contains the default card deck set for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kdegames-carddecks-default-23.04.0-1.1.noarch.rpm"
RPM_HASH = "4bd50f7785ad0f7d37ccb230aaa240de01955594ef8df93838a4dc2f9f542a1a1ec0d1fe46d5754026a8b52b1990650888fa6805d1dc70aef2ffce294b67ce24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdegames-carddecks-default"
RDEPENDS:${PN} += ""

inherit rpm
