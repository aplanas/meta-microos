SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtdeclarative that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde23"

RPM_NAME = "libqt5-qtdeclarative-private-headers-devel-5.15.9+kde23-1.1.noarch.rpm"
RPM_HASH = "c5e66fceb5a6f15dc019fdfffc394106ffec026568acd1eaf1256faa0dd2dd45e315b61463a264be0bf61a2bb770b3b57cee5a38896f42f2cd78146b47efceb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Quick-private-headers-devel libqt5-qtdeclarative-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Gui-private-headers-devel libQt5Test-private-headers-devel libQt5Widgets-private-headers-devel libqt5-qtdeclarative-devel"

inherit rpm
