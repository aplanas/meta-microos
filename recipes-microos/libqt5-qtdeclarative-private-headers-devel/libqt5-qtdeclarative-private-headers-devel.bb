SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtdeclarative that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde25"

RPM_NAME = "libqt5-qtdeclarative-private-headers-devel-5.15.9+kde25-1.1.noarch.rpm"
RPM_HASH = "c31ed4011ff4f2714e64e5815dd83a20312ed79388f71be1c22f40b8213ef636131694a9a2900fe93d65be5af4202ae34b9b052083b002e2571e00de25ec90ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Quick-private-headers-devel libqt5-qtdeclarative-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Gui-private-headers-devel libQt5Test-private-headers-devel libQt5Widgets-private-headers-devel libqt5-qtdeclarative-devel"

inherit rpm
