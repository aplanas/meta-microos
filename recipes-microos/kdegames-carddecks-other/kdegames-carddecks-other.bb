SUMMARY = "Further Card Decks for KDE Games"
DESCRIPTION = "This package contains several further card deck set for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kdegames-carddecks-other-23.04.0-1.1.noarch.rpm"
RPM_HASH = "dc1a2668e24eef467408722534ee673be48f87723b632d5a5d1df50ae2d15e906d13f26bcc52147eb076d7c9899aa0a46772a524fc0e35ec51a69d71a4831094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdegames-carddecks-other"
RDEPENDS:${PN} += "kdegames-carddecks-default"

inherit rpm
