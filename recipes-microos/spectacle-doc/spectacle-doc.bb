SUMMARY = "Documentation for Spectacle"
DESCRIPTION = "This package contains the documentation available for Spectacle, which is a \
screenshot capture program by KDE."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "spectacle-doc-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "2b9c2eada0e26a5bb512510129f1977203462709bc20bfdc97bebbd605b7168e48c9460fb3697f70229c8bab2a7116650cb13c37e7f963d90a340b445560e13a"

RPROVIDES:${PN} += "spectacle-doc spectacle-doc(aarch-64)"
RDEPENDS:${PN} += "spectacle"

inherit rpm
