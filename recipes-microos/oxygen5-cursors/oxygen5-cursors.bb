SUMMARY = "The KDE Plasma Workspace Cursors"
DESCRIPTION = "This package contains the Oxygen cursor set."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "oxygen5-cursors-5.27.5-1.1.noarch.rpm"
RPM_HASH = "71418299e410e7d700c9459d1a9a5a2e17d30d393ae25e7b30e7353001fb288cc01d7d5268293b49b06785fb31ad2cd71feb7ebadae792f82c2160042f223f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-cursors oxygen-cursors4 oxygen-cursors5 oxygen4-cursors oxygen5-cursors"
RDEPENDS:${PN} += ""

inherit rpm
