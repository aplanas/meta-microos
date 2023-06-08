SUMMARY = "Non-ABI stable experimental API for the Qt5 Location Library"
DESCRIPTION = "This package provides private headers of libqt5-qtlocation that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtlocation-private-headers-devel-5.15.9+kde5-1.1.noarch.rpm"
RPM_HASH = "91df6c7d5d5f47c81c441d45307b85731e09bd4354c1f9ea1d2e98980587945bfecf2052a38b26ff22b97373ac356562bfd156cda919247f3589b5d88b9d0970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtlocation-private-headers-devel"
RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel libqt5-qtdeclarative-private-headers-devel libqt5-qtlocation-devel"

inherit rpm
