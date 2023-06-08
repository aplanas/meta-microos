SUMMARY = "Non-ABI stable experimental API for the Qt5 gamepad library"
DESCRIPTION = "This package provides private headers of libqt5-qtgamepad that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtgamepad-private-headers-devel-5.15.9+kde0-1.1.noarch.rpm"
RPM_HASH = "f219e831c63cf7afe53fcbf08f742562583fac6d2a14b9174f883ea82779c4be0de77c10fb62d0302627491091b0349303546fcb1333ea4a059b7726c808a076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtgamepad-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libqt5-qtgamepad-devel"

inherit rpm
